package defpackage;

import android.content.res.Resources;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qo0 */
/* loaded from: classes.dex */
public final class C2150Qo0 extends C1760No0 {
    public final Resources j;
    public boolean k;

    public C2150Qo0(Resources resources, InterfaceC3241Yy1 interfaceC3241Yy1, C6314iY3 c6314iY3, I5 i5) {
        super(resources, interfaceC3241Yy1, c6314iY3, i5);
        this.j = resources;
    }

    @Override // defpackage.C1760No0
    public final C12188zf3 a(C1630Mo0 c1630Mo0) {
        if (this.k) {
            return null;
        }
        this.k = true;
        Resources resources = this.j;
        String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6b);
        String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1404e0);
        C12188zf3 a = C12188zf3.a(string, c1630Mo0, 0, 33);
        a.d = string2;
        a.e = null;
        a.j = 7000;
        a.i = false;
        return a;
    }
}
