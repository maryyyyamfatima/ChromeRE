package org.chromium.components.permissions.nfc;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC5103f04;
import defpackage.BD2;
import defpackage.D42;
import defpackage.V60;
import defpackage.ZX1;
import org.chromium.base.task.PostTask;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class NfcSystemLevelSetting {
    public static boolean isNfcSystemLevelSettingEnabled() {
        if (isNfcAccessPossible()) {
            return NfcAdapter.getDefaultAdapter(V60.a).isEnabled();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F42, java.lang.Runnable] */
    public static void promptToEnableNfcSystemLevelSetting(WebContents webContents, final long j) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: E42
                @Override // java.lang.Runnable
                public final void run() {
                    N.M4qSX4lZ(j);
                }
            });
            return;
        }
        D42 d42 = new D42();
        final ?? r1 = new Runnable() { // from class: F42
            @Override // java.lang.Runnable
            public final void run() {
                N.M4qSX4lZ(j);
            }
        };
        ZX1 s = Q0.s();
        if (s == null) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: B42
                @Override // java.lang.Runnable
                public final void run() {
                    r1.run();
                }
            });
            return;
        }
        Activity activity = (Activity) Q0.k().get();
        View inflate = LayoutInflater.from(activity).inflate(R.layout.f59610_resource_name_obfuscated_res_0x7f0e01f5, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        textView.setText(R.string.f78250_resource_name_obfuscated_res_0x7f1406ce);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.f46530_resource_name_obfuscated_res_0x7f090193, 0, 0, 0);
        Resources resources = activity.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, d42);
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.d(AbstractC4249cY1.j, resources, R.string.f78270_resource_name_obfuscated_res_0x7f1406d0);
        bd2.d(AbstractC4249cY1.n, resources, R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
        bd2.d(AbstractC4249cY1.b, resources, R.string.f78250_resource_name_obfuscated_res_0x7f1406ce);
        bd2.b(AbstractC4249cY1.s, true);
        PropertyModel a = bd2.a();
        d42.g = Q0;
        d42.h = r1;
        d42.a = s;
        s.l(a, 0, false);
    }

    public static boolean isNfcAccessPossible() {
        Context context = V60.a;
        return context.checkPermission("android.permission.NFC", Process.myPid(), Process.myUid()) == 0 && NfcAdapter.getDefaultAdapter(context) != null;
    }
}
