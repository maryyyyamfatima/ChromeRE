package defpackage;

import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10802vd1 implements InterfaceC12080zL0 {
    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        String string = Settings.Secure.getString(V60.a.getContentResolver(), "default_input_method");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC9048qW.c(Pair.create("Default IME", string));
    }
}
