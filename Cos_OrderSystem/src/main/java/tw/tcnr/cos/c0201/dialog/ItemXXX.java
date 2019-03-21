package tw.tcnr.cos.c0201.dialog;

import java.util.List;

import top.defaults.view.PickerView;

public class ItemXXX implements PickerView.PickerItem {

    private String text;

    public ItemXXX(String s) {
        text = s;
    }

    @Override
    public String getText() {
        return text;
    }

    public static List<ItemXXX> sampleItems() {

        return null;
    }
}
