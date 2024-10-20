package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nw4 implements InterfaceC6793jv4 {
    public final InterfaceC6793jv4 a;

    public Nw4(Lw4 lw4) {
        this.a = lw4;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        String string;
        Context context = ((Lw4) this.a).a.a;
        if (context == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(context.getExternalFilesDir(null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
