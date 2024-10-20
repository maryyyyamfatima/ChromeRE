package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w52, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10968w52 implements PB {
    public final ViewGroup a;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final int b() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final void destroy() {
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.f86070_resource_name_obfuscated_res_0x7f1409f8;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.f86050_resource_name_obfuscated_res_0x7f1409f6;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.f85950_resource_name_obfuscated_res_0x7f1409ec;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.f86060_resource_name_obfuscated_res_0x7f1409f7;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return true;
    }

    public C10968w52(Context context) {
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("SendTabToSelfSigninPromo");
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.f60720_resource_name_obfuscated_res_0x7f0e026a, (ViewGroup) null);
        this.a = viewGroup;
        if (M09VlOh_) {
            ((TextView) viewGroup.findViewById(R.id.empty_state_label)).setText(R.string.f85940_resource_name_obfuscated_res_0x7f1409eb);
            viewGroup.findViewById(R.id.manage_account_devices_link).setVisibility(0);
        }
        FI2.a("SharingHubAndroid.SendTabToSelf.NoTargetDevices");
    }

    @Override // defpackage.PB
    public final View c() {
        return this.a;
    }
}
