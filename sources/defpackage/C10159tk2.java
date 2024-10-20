package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.h;
import com.android.chrome.R;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tk2 */
/* loaded from: classes.dex */
public final class C10159tk2 {
    public final Context a;
    public final h b;
    public Callback c;

    public C10159tk2(Activity activity, h hVar) {
        this.a = activity;
        this.b = hVar;
    }

    public final void a(Callback callback, int i) {
        if (YH2.a(0)) {
            EI2.h(2, 3, "PasswordManager.ReauthToAccessPasswordInSettings");
            callback.onResult(Boolean.TRUE);
            return;
        }
        this.c = callback;
        h hVar = this.b;
        if (i == 0) {
            YH2.b(R.string.0_resource_name_obfuscated_res_0x7f1405d8, -1, hVar, 0);
        } else if (i == 1) {
            YH2.b(R.string.0_resource_name_obfuscated_res_0x7f1405d6, -1, hVar, 0);
        } else {
            if (i != 2) {
                return;
            }
            YH2.b(R.string.0_resource_name_obfuscated_res_0x7f1405d5, -1, hVar, 0);
        }
    }
}
