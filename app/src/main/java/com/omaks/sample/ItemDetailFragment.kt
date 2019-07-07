package com.omaks.sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_item_detail.*
import kotlinx.android.synthetic.main.item_detail.view.*
import javax.inject.Inject

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [ItemListActivity]
 * in two-pane mode (on tablets) or a [ItemDetailActivity]
 * on handsets.
 */
class ItemDetailFragment : Fragment() {

    private var item: Item? = null

    @Inject
    lateinit var repository: ItemsRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerAppComponent.create().inject(this)
        val itemsMap = repository.getItemsMap()
        arguments?.let {
            it.getString(ARG_ITEM_ID)?.also {itemKey ->
                item = itemsMap[itemKey]
                activity?.toolbar_layout?.title = item?.getItemContent()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.item_detail, container, false)
        item?.let {
            rootView.item_detail.text = it.getItemDetails()
        }
        return rootView
    }

    companion object {
        const val ARG_ITEM_ID = "item_id"
    }
}
