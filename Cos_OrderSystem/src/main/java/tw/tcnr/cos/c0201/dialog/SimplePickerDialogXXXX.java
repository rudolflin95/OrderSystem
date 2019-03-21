package tw.tcnr.cos.c0201.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import top.defaults.view.PickerView;
import top.defaults.view.PickerViewDialog;
import tw.tcnr.cos.c0201.R;

public class SimplePickerDialogXXXX extends BaseDialogFragment {

    private static int itemNum;
    private PickerView pickerView;
    private String[] itemWhere,itemStore;

    public static SimplePickerDialogXXXX newInstance(int type, ActionListener actionListener, int pos) {
        itemNum = pos;
        return BaseDialogFragment.newInstance(SimplePickerDialogXXXX.class, type, actionListener);
    }

    @Override
    public Dialog createDialog(Bundle savedInstanceState) {
        PickerViewDialog dialog = new PickerViewDialog(getActivity());
        dialog.setContentView(R.layout.dlg_layout);

        pickerView = dialog.findViewById(R.id.pickerView);
        Log.d("tcnr11", "itemnum = "+itemNum);

        //-------------選到的listview item position---------
         List<ItemXXX> items = new ArrayList<>();
        switch (itemNum){
            case 0:
                itemWhere = getResources().getStringArray(R.array.c0201_txtWhereToEat);
                Log.d("tcnr11", "itemWhere = "+itemWhere);
                for (int i=0;i<itemWhere.length;i++){
                    items.add(new ItemXXX(itemWhere[i]));
                }
                pickerView.setItems(items,null);
                break;
            case 1:
                break;
            case 2:
                itemStore = getResources().getStringArray(R.array.c0201_txtWhichStore);
                for (int i=0;i<itemStore.length;i++){
                    items.add(new ItemXXX(itemStore[i]));
                }
                pickerView.setItems(items,null);
                break;
            case 3:
                break;
        }

        Log.d("tcnr11", "itemWhere = "+itemWhere);

        attachActions(dialog.findViewById(R.id.done), dialog.findViewById(R.id.cancel));
        return dialog;
    }

    @Nullable
    @Override
    public View createView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dlg_layout, container, false);

        pickerView = view.findViewById(R.id.pickerView);
        pickerView.setItems(ItemXXX.sampleItems(), null);

        attachActions(view.findViewById(R.id.done), view.findViewById(R.id.cancel));
        return view;
    }

    public ItemXXX getSelectedItem() {

        return pickerView.getSelectedItem(ItemXXX.class);

    }
}
