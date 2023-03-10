package com.facebook.react.views.picker;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;

class ReactPickerItem {
    public final Integer color;
    public final String label;

    public ReactPickerItem(ReadableMap readableMap) {
        this.label = readableMap.getString("label");
        if (!readableMap.hasKey(ViewProps.COLOR) || readableMap.isNull(ViewProps.COLOR)) {
            this.color = null;
        } else {
            this.color = Integer.valueOf(readableMap.getInt(ViewProps.COLOR));
        }
    }

    public static List<ReactPickerItem> createFromJsArrayMap(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(new ReactPickerItem(readableArray.getMap(i)));
        }
        return arrayList;
    }
}
