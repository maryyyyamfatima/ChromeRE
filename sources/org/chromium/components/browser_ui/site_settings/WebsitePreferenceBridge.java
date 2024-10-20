package org.chromium.components.browser_ui.site_settings;

import defpackage.C1128Ir2;
import defpackage.C4498dF1;
import defpackage.C5901hL;
import defpackage.C7426lm3;
import defpackage.L50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebsitePreferenceBridge {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface StorageInfoClearedCallback {
        void onStorageInfoCleared();
    }

    public static void insertPermissionInfoIntoList(int i, ArrayList arrayList, String str, String str2, boolean z) {
        if (i == 9 || i == 8) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1128Ir2 c1128Ir2 = (C1128Ir2) it.next();
                if (c1128Ir2.h.equals(str) && c1128Ir2.g.equals(str2)) {
                    return;
                }
            }
        }
        arrayList.add(new C1128Ir2(str, str2, z, i));
    }

    public static void insertStorageInfoIntoList(ArrayList arrayList, String str, int i, long j) {
        arrayList.add(new C7426lm3(i, str, j));
    }

    public static Object createStorageInfoList() {
        return new ArrayList();
    }

    public static Object createLocalStorageInfoMap() {
        return new HashMap();
    }

    public static void insertLocalStorageInfoIntoMap(HashMap hashMap, String str, long j, boolean z) {
        hashMap.put(str, new C4498dF1(j, str, z));
    }

    public static void insertChosenObjectInfoIntoList(ArrayList arrayList, int i, String str, String str2, String str3, boolean z) {
        arrayList.add(new C5901hL(i, str, str2, str3, z));
    }

    public static void addContentSettingExceptionToList(ArrayList arrayList, int i, String str, String str2, int i2, String str3, boolean z) {
        if (str3 == null) {
            str3 = "";
        }
        arrayList.add(new L50(i, str, str2, Integer.valueOf(i2), str3, z));
    }
}
