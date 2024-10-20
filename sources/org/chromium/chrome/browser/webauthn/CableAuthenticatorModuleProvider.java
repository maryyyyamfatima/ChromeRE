package org.chromium.chrome.browser.webauthn;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.c;
import androidx.fragment.app.h;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6896kE;
import defpackage.C10431uY1;
import defpackage.C6210iE;
import defpackage.C6674jc;
import defpackage.C6861k72;
import defpackage.InterfaceC2401Sm1;
import defpackage.K62;
import defpackage.PO;
import defpackage.US0;
import defpackage.V60;
import defpackage.X5;
import defpackage.X72;
import java.util.ArrayList;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.webauth.authenticator.CableAuthenticatorActivity;
import org.chromium.chrome.browser.webauthn.CableAuthenticatorModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CableAuthenticatorModuleProvider extends c implements View.OnClickListener {
    public static final /* synthetic */ int c0 = 0;
    public View b0;

    public static void onCloudMessage(byte[] bArr, boolean z) {
        String string;
        String string2;
        Context context = V60.a;
        Resources resources = context.getResources();
        try {
            int i = CableAuthenticatorActivity.B;
            Intent intent = new Intent(context, (Class<?>) CableAuthenticatorActivity.class);
            intent.setFlags(268468224);
            Bundle bundle = new Bundle();
            bundle.putBoolean("org.chromium.chrome.modules.cablev2_authenticator.FCM", true);
            bundle.putByteArray("org.chromium.chrome.modules.cablev2_authenticator.EVENT", bArr);
            intent.putExtra("show_fragment_args", bundle);
            PendingIntent activity = PendingIntent.getActivity(context, 424386536, intent, 201326592);
            if (z) {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402db);
                string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402da);
            } else {
                string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402d7);
                string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1402d6);
            }
            PO a = X72.a("security_key", null);
            a.a.d(true);
            K62 k62 = a.a;
            k62.u = "msg";
            k62.g = activity;
            k62.e(string2);
            k62.f(string);
            k62.k = 2;
            a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
            k62.C = 60000L;
            k62.x = 1;
            new C6861k72(context).c(null, 16, a.c());
        } catch (ClassNotFoundException unused) {
            AbstractC4851eH1.a("CableAuthModuleProv", "Failed to find class org.chromium.chrome.browser.webauth.authenticator.CableAuthenticatorActivity", new Object[0]);
        }
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(K());
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0077, viewGroup, false);
        this.b0 = inflate;
        inflate.findViewById(R.id.error_close).setOnClickListener(this);
        ((TextView) this.b0.findViewById(R.id.error_code)).setText(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1402cf, 99));
        if (Build.VERSION.SDK_INT < 24) {
            ((TextView) this.b0.findViewById(R.id.error_description)).setText(N().getString(R.string.0_resource_name_obfuscated_res_0x7f14064b));
            return this.b0;
        }
        ((TextView) this.b0.findViewById(R.id.error_description)).setText(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1402d1));
        C10431uY1 c10431uY1 = AbstractC6896kE.a;
        if (!c10431uY1.g()) {
            c10431uY1.d(new InterfaceC2401Sm1() { // from class: gE
                @Override // defpackage.InterfaceC2401Sm1
                public final void a(boolean z) {
                    int i = CableAuthenticatorModuleProvider.c0;
                    final CableAuthenticatorModuleProvider cableAuthenticatorModuleProvider = CableAuthenticatorModuleProvider.this;
                    if (!z) {
                        cableAuthenticatorModuleProvider.getClass();
                        AbstractC4851eH1.a("CableAuthModuleProv", "Failed to install caBLE DFM", new Object[0]);
                        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: hE
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = CableAuthenticatorModuleProvider.c0;
                                CableAuthenticatorModuleProvider cableAuthenticatorModuleProvider2 = CableAuthenticatorModuleProvider.this;
                                ViewGroup viewGroup2 = (ViewGroup) cableAuthenticatorModuleProvider2.L;
                                viewGroup2.removeAllViews();
                                viewGroup2.addView(cableAuthenticatorModuleProvider2.b0);
                            }
                        });
                        return;
                    }
                    cableAuthenticatorModuleProvider.L0();
                    throw null;
                }
            });
            linearLayout.addView(layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0079, viewGroup, false));
            ((TextView) linearLayout.findViewById(R.id.status_text)).setText(N().getString(R.string.0_resource_name_obfuscated_res_0x7f1402e9));
            C6674jc b = C6674jc.b(K(), R.drawable.0_resource_name_obfuscated_res_0x7f090124);
            b.a(new C6210iE(b));
            ((ImageView) linearLayout.findViewById(R.id.spinner)).setImageDrawable(b);
            b.start();
            return linearLayout;
        }
        L0();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        getActivity().finish();
    }

    public final void L0() {
        h M = M();
        M.E();
        US0 us0 = M.u;
        if (us0 != null) {
            us0.g.getClassLoader();
        }
        new ArrayList();
        X5.a(AbstractC6896kE.a.b());
        throw null;
    }

    public static boolean canDeviceSupportCable() {
        if (Build.VERSION.SDK_INT < 24 || BluetoothAdapter.getDefaultAdapter() == null) {
            return false;
        }
        return ((KeyguardManager) V60.a.getSystemService("keyguard")).isDeviceSecure();
    }
}
