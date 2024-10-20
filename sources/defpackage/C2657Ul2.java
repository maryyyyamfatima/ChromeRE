package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.password_manager.PasswordGenerationDialogCustomView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ul2 */
/* loaded from: classes.dex */
public final class C2657Ul2 {
    public final ZX1 a;
    public final C2917Wl2 b = new C2917Wl2();
    public final PasswordGenerationDialogCustomView c;
    public PropertyModel d;

    public C2657Ul2(WindowAndroid windowAndroid) {
        this.a = windowAndroid.s();
        this.c = (PasswordGenerationDialogCustomView) LayoutInflater.from((Activity) windowAndroid.k().get()).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e3, (ViewGroup) null);
    }
}
