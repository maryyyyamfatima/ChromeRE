package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k83, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6868k83 {
    public final String a;
    public final String b;
    public final String c;
    public final C6524j83 d;

    public C6868k83(String str, String str2, String str3, C6524j83 c6524j83) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c6524j83;
    }

    public static C6868k83 a(Bundle bundle) {
        ArrayList arrayList;
        C6524j83 c6524j83;
        C6182i83 c6182i83;
        String string = bundle.getString("androidx.browser.trusted.sharing.KEY_ACTION");
        String string2 = bundle.getString("androidx.browser.trusted.sharing.KEY_METHOD");
        String string3 = bundle.getString("androidx.browser.trusted.sharing.KEY_ENCTYPE");
        Bundle bundle2 = bundle.getBundle("androidx.browser.trusted.sharing.KEY_PARAMS");
        if (bundle2 == null) {
            c6524j83 = null;
        } else {
            ArrayList<Bundle> parcelableArrayList = bundle2.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES");
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                for (Bundle bundle3 : parcelableArrayList) {
                    if (bundle3 != null) {
                        String string4 = bundle3.getString("androidx.browser.trusted.sharing.KEY_FILE_NAME");
                        ArrayList<String> stringArrayList = bundle3.getStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES");
                        if (string4 != null && stringArrayList != null) {
                            c6182i83 = new C6182i83(string4, stringArrayList);
                            arrayList.add(c6182i83);
                        }
                    }
                    c6182i83 = null;
                    arrayList.add(c6182i83);
                }
            } else {
                arrayList = null;
            }
            c6524j83 = new C6524j83(bundle2.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle2.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }
        if (string == null || c6524j83 == null) {
            return null;
        }
        return new C6868k83(string, string2, string3, c6524j83);
    }
}
