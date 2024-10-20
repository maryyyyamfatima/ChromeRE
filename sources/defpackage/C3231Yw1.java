package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3231Yw1 extends AbstractC11280x01 {
    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.InterfaceC3129Yc
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String n() {
        return "com.google.android.gms.languageprofile.internal.ILanguageProfileService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String o() {
        return "com.google.android.gms.languageprofile.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean x() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface e(IBinder iBinder) {
        int i = AbstractBinderC5996hd1.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.languageprofile.internal.ILanguageProfileService");
        if (queryLocalInterface instanceof InterfaceC6340id1) {
            return (InterfaceC6340id1) queryLocalInterface;
        }
        return new C5652gd1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] g() {
        return AbstractC11722yI0.a;
    }

    public C3231Yw1(Context context, Looper looper, InterfaceC9914t11 interfaceC9914t11, InterfaceC10257u11 interfaceC10257u11, JU ju) {
        super(context, looper, 167, ju, interfaceC9914t11, interfaceC10257u11);
    }
}
