package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import org.chromium.ui.base.SelectFileDialog;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w23 */
/* loaded from: classes2.dex */
public final class C10951w23 extends AbstractC0185Bl {
    public final Context h;
    public final String i;
    public final /* synthetic */ SelectFileDialog j;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Context context = this.h;
        String str = this.i;
        return Boolean.valueOf((SelectFileDialog.j(context, str) || N.MWck3aif(str).isEmpty()) ? false : true);
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SelectFileDialog selectFileDialog = this.j;
        if (booleanValue) {
            selectFileDialog.n(selectFileDialog.a, this.i, "");
            C1861Oi1 c1861Oi1 = WindowAndroid.B;
            String string = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f14072e);
            if (string != null) {
                ZN3.c(V60.a, string, 0).d();
                return;
            }
            return;
        }
        String[] strArr = SelectFileDialog.q;
        selectFileDialog.m();
    }

    public C10951w23(SelectFileDialog selectFileDialog, Context context, String str) {
        this.j = selectFileDialog;
        this.h = context;
        this.i = str;
    }
}
