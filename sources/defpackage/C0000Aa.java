package defpackage;

import J.N;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.payments.PaymentApp;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0000Aa extends PaymentApp implements InterfaceC9178qs1 {
    public boolean A;
    public C5371fn4 B;
    public final Handler p;
    public final InterfaceC10782va q;
    public final HashSet r;
    public final boolean s;
    public final String t;
    public final String u;
    public final String v;
    public C0260Ca w;
    public InterfaceC6063ho2 x;
    public final String y;
    public final C2418Sp3 z;

    @Override // org.chromium.components.payments.PaymentApp
    public final void k() {
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final int p() {
        return 2;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean u() {
        return this.z.a;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean s() {
        return this.z.b;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean t() {
        return this.z.c;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean r() {
        return this.z.d;
    }

    public C0000Aa(C12154za c12154za, String str, String str2, String str3, String str4, Drawable drawable, boolean z, String str5, C2418Sp3 c2418Sp3) {
        super(drawable, str, str4, null);
        Object obj = ThreadUtils.a;
        this.p = new Handler();
        this.q = c12154za;
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.r = new HashSet();
        this.s = z;
        this.y = str5;
        this.z = c2418Sp3;
        this.A = false;
    }

    public final void G(boolean z) {
        Object obj = ThreadUtils.a;
        C0260Ca c0260Ca = this.w;
        if (c0260Ca == null) {
            return;
        }
        C0520Ea c0520Ea = c0260Ca.a;
        InterfaceC6749jo2 interfaceC6749jo2 = c0520Ea.f;
        if (z) {
            interfaceC6749jo2.g(this);
        }
        int i = c0520Ea.p - 1;
        c0520Ea.p = i;
        if (i == 0) {
            interfaceC6749jo2.d(c0520Ea.g);
        }
        this.w = null;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final String l() {
        return this.y;
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final Set o() {
        return Collections.unmodifiableSet(this.r);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [pa] */
    /* JADX WARN: Type inference failed for: r14v0, types: [oa] */
    @Override // org.chromium.components.payments.PaymentApp
    public final void v(final String str, final String str2, String str3, String str4, final byte[][] bArr, final Map map, final C5037ep2 c5037ep2, final List list, final Map map2, final C7787mp2 c7787mp2, final List list2, InterfaceC6063ho2 interfaceC6063ho2) {
        this.x = interfaceC6063ho2;
        final String MR6Af3ZS = N.MR6Af3ZS(str3, 1);
        final String MR6Af3ZS2 = N.MR6Af3ZS(str4, 1);
        final ?? r14 = new Runnable() { // from class: oa
            /* JADX WARN: Removed duplicated region for block: B:49:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0271 A[Catch: IOException -> 0x0287, TryCatch #1 {IOException -> 0x0287, blocks: (B:59:0x0250, B:61:0x0271, B:62:0x027d), top: B:58:0x0250 }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x02ab  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x02af  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x028e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 722
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC8382oa.run():void");
            }
        };
        if (!this.s) {
            r14.run();
            return;
        }
        final ?? r0 = new Callback() { // from class: pa
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C0000Aa.this.F((String) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        WindowAndroid Q0 = ((C12154za) this.q).a.Q0();
        Context context = Q0 == null ? null : (Context) Q0.k().get();
        if (context == null) {
            r0.onResult("Unable to find Chrome activity.");
            return;
        }
        C5490g8 c5490g8 = new C5490g8(context, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(R.string.f73510_resource_name_obfuscated_res_0x7f140487);
        c5490g8.b(R.string.f73560_resource_name_obfuscated_res_0x7f14048c);
        c5490g8.f(R.string.f78930_resource_name_obfuscated_res_0x7f140717, new DialogInterface.OnClickListener() { // from class: wa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                r14.run();
            }
        });
        c5490g8.e(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4, new DialogInterface.OnClickListener() { // from class: xa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                r0.onResult("User closed the Payment Request UI.");
            }
        });
        c5490g8.a.l = new DialogInterface.OnCancelListener() { // from class: ya
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                r0.onResult("User closed the Payment Request UI.");
            }
        };
        c5490g8.k();
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void E(C0858Gp2 c0858Gp2) {
        List<C12253zq2> asList;
        ArrayList arrayList;
        C6059hn4 c6059hn4;
        Bundle bundle;
        Object obj = ThreadUtils.a;
        C0203Bo2 a = C0203Bo2.a();
        C9840so2 c9840so2 = c0858Gp2.b;
        C3997bn4 c3997bn4 = c9840so2 == null ? null : new C3997bn4(c9840so2.b, c9840so2.c);
        C12253zq2[] c12253zq2Arr = c0858Gp2.c;
        if (c12253zq2Arr == null || (asList = Arrays.asList(c12253zq2Arr)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (C12253zq2 c12253zq2 : asList) {
                if (c12253zq2 == null) {
                    c6059hn4 = null;
                } else {
                    String str = c12253zq2.b;
                    String str2 = c12253zq2.c;
                    C9840so2 c9840so22 = c12253zq2.d;
                    c6059hn4 = new C6059hn4(str, str2, c9840so22 == null ? null : new C3997bn4(c9840so22.b, c9840so22.c), c12253zq2.e);
                }
                arrayList.add(c6059hn4);
            }
        }
        String str3 = c0858Gp2.e;
        String str4 = c0858Gp2.f;
        M7 m7 = c0858Gp2.g;
        if (m7 == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            AbstractC6402in4.b(bundle2, "addressLine", m7.b);
            AbstractC6402in4.b(bundle2, "city", m7.c);
            AbstractC6402in4.b(bundle2, "countryCode", m7.d);
            AbstractC6402in4.b(bundle2, "dependentLocality", m7.e);
            AbstractC6402in4.b(bundle2, "organization", m7.f);
            AbstractC6402in4.b(bundle2, "phone", m7.g);
            AbstractC6402in4.b(bundle2, "postalCode", m7.h);
            AbstractC6402in4.b(bundle2, "recipient", m7.i);
            AbstractC6402in4.b(bundle2, "region", m7.j);
            AbstractC6402in4.b(bundle2, "sortingCode", m7.k);
            bundle = bundle2;
        }
        C5715gn4 c5715gn4 = new C5715gn4(c3997bn4, arrayList, str3, str4, bundle);
        a.getClass();
        InterfaceC1192Je1 interfaceC1192Je1 = a.a;
        try {
            if (interfaceC1192Je1 == null) {
                return;
            }
            try {
                ((C1062Ie1) interfaceC1192Je1).e(c5715gn4.a());
            } catch (RemoteException e) {
                AbstractC4851eH1.a("PaymentDetailsUpdate", "Error calling updateWith", e);
            }
        } finally {
            a.a = null;
        }
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final void B() {
        Object obj = ThreadUtils.a;
        C0203Bo2 a = C0203Bo2.a();
        a.getClass();
        InterfaceC1192Je1 interfaceC1192Je1 = a.a;
        if (interfaceC1192Je1 == null) {
            return;
        }
        try {
            try {
                ((C1062Ie1) interfaceC1192Je1).a();
            } catch (RemoteException e) {
                AbstractC4851eH1.a("PaymentDetailsUpdate", "Error calling paymentDetailsNotUpdated", e);
            }
        } finally {
            a.a = null;
        }
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean A() {
        Object obj = ThreadUtils.a;
        C0203Bo2 a = C0203Bo2.a();
        a.getClass();
        return a.a != null;
    }

    public final void F(final String str) {
        this.p.post(new Runnable() { // from class: qa
            @Override // java.lang.Runnable
            public final void run() {
                C0000Aa c0000Aa = C0000Aa.this;
                ((C2287Rp2) c0000Aa.x).n(str);
                c0000Aa.x = null;
            }
        });
    }

    @Override // org.chromium.components.payments.PaymentApp
    public final boolean w() {
        return this.A;
    }
}
