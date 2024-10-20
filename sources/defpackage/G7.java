package defpackage;

import android.app.ProgressDialog;
import android.util.Pair;
import com.android.chrome.R;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G7 implements Callback {
    public final /* synthetic */ K7 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public G7(K7 k7) {
        this.a = k7;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Pair pair = (Pair) obj;
        K7 k7 = this.a;
        k7.u.c.clear();
        ProgressDialog progressDialog = new ProgressDialog(k7.b);
        k7.v = progressDialog;
        progressDialog.setMessage(k7.b.getText(R.string.0_resource_name_obfuscated_res_0x7f14081b));
        k7.v.show();
        String str = (String) pair.first;
        k7.r = str;
        k7.i.g = str;
        k7.j.a = str;
        k7.s = (Runnable) pair.second;
        k7.g(str);
    }
}
