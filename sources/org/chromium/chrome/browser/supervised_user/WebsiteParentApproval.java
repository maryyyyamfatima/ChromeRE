package org.chromium.chrome.browser.supervised_user;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import com.android.chrome.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import defpackage.AF3;
import defpackage.AbstractC10681vF3;
import defpackage.AbstractC11379xI0;
import defpackage.BA1;
import defpackage.C11710yF3;
import defpackage.C2612Uc2;
import defpackage.C2941Wq1;
import defpackage.C5531gF3;
import defpackage.C6376ij2;
import defpackage.C6561jF3;
import defpackage.C7027kd2;
import defpackage.DA1;
import defpackage.ExecutorC9995tF3;
import defpackage.InterfaceC2872Wc2;
import defpackage.InterfaceC5565gM2;
import defpackage.InterfaceC7371ld2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WebsiteParentApproval {
    public static boolean isLocalApprovalSupported() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ao4] */
    public static void requestLocalApproval(final WindowAndroid windowAndroid, final GURL gurl) {
        final C6376ij2 c6376ij2 = new C6376ij2();
        final ?? r1 = new Callback() { // from class: Ao4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    Bo4 bo4 = new Bo4();
                    HashMap e = PropertyModel.e(AbstractC8471oo4.e);
                    JD2 jd2 = AbstractC8471oo4.b;
                    GD2 gd2 = new GD2();
                    gd2.a = gurl;
                    PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd2, e);
                    WindowAndroid windowAndroid2 = WindowAndroid.this;
                    QB a2 = UB.a(windowAndroid2);
                    C8814po4 c8814po4 = new C8814po4((Context) windowAndroid2.j.get());
                    UD2.a(a, c8814po4, new TD2() { // from class: ko4
                        @Override // defpackage.TD2
                        public final void d(WD2 wd2, Object obj2, Object obj3) {
                            PropertyModel propertyModel = (PropertyModel) wd2;
                            C8814po4 c8814po42 = (C8814po4) obj2;
                            FD2 fd2 = (FD2) obj3;
                            PD2 pd2 = AbstractC8471oo4.a;
                            if (fd2 == pd2) {
                                ((DialogTitle) c8814po42.g.findViewById(R.id.website_approval_sheet_title)).setText(c8814po42.a.getString(R.string.0_resource_name_obfuscated_res_0x7f14078f, (String) propertyModel.i(pd2)));
                                return;
                            }
                            JD2 jd22 = AbstractC8471oo4.b;
                            if (fd2 == jd22) {
                                ((TextView) c8814po42.g.findViewById(R.id.all_pages_of)).setText(c8814po42.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140789, ((GURL) propertyModel.i(jd22)).d()));
                                ((TextView) c8814po42.g.findViewById(R.id.full_url)).setText(((GURL) propertyModel.i(jd22)).i());
                                return;
                            }
                            PD2 pd22 = AbstractC8471oo4.c;
                            if (fd2 == pd22) {
                                ((ButtonCompat) c8814po42.g.findViewById(R.id.approve_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd22));
                                return;
                            }
                            PD2 pd23 = AbstractC8471oo4.d;
                            if (fd2 == pd23) {
                                ((ButtonCompat) c8814po42.g.findViewById(R.id.deny_button)).setOnClickListener((View.OnClickListener) propertyModel.i(pd23));
                            }
                        }
                    });
                    final C8127no4 c8127no4 = new C8127no4(bo4, a);
                    a.o(AbstractC8471oo4.c, new View.OnClickListener() { // from class: lo4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C8127no4.this.a.getClass();
                            N.MEedSkgE(true);
                        }
                    });
                    a.o(AbstractC8471oo4.d, new View.OnClickListener() { // from class: mo4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C8127no4.this.a.getClass();
                            N.MEedSkgE(false);
                        }
                    });
                    C1202Jg1 a3 = C1202Jg1.a();
                    Profile d = Profile.d();
                    a3.getClass();
                    IdentityManager b = C1202Jg1.b(d);
                    String b2 = CoreAccountInfo.b(b.b(0));
                    if (b2 != null) {
                        AccountInfo accountInfo = (AccountInfo) N.MAwvRw4K(b.a, b2);
                        if (accountInfo != null) {
                            String str = accountInfo.e;
                            if (!str.isEmpty()) {
                                b2 = str;
                            }
                        }
                        a.o(AbstractC8471oo4.a, b2);
                    }
                    ((m) a2).p(c8814po4, true);
                    return;
                }
                N.MEedSkgE(false);
            }
        };
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            return;
        }
        final C2941Wq1 c2941Wq1 = new C2941Wq1(activity);
        final GetParentVerificationIntentRequest getParentVerificationIntentRequest = new GetParentVerificationIntentRequest(0);
        getParentVerificationIntentRequest.g = 1;
        getParentVerificationIntentRequest.h = "901d458a";
        getParentVerificationIntentRequest.i = 2;
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{AbstractC11379xI0.a};
        c5531gF3.b = false;
        c5531gF3.d = 14103;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Tq1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C2941Wq1.this.getClass();
                InterfaceC4964ed1 interfaceC4964ed1 = (InterfaceC4964ed1) ((C0497Dv1) obj).m();
                BinderC2811Vq1 binderC2811Vq1 = new BinderC2811Vq1((C6905kF3) obj2);
                C4277cd1 c4277cd1 = (C4277cd1) interfaceC4964ed1;
                Parcel a = c4277cd1.a();
                AbstractC11786yV.b(a, getParentVerificationIntentRequest);
                AbstractC11786yV.c(a, binderC2811Vq1);
                c4277cd1.h(3005, a);
            }
        };
        AF3 b = c2941Wq1.b(0, c5531gF3.a());
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: fj2
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                C6376ij2.this.getClass();
                C6033hj2 c6033hj2 = new C6033hj2(r1);
                windowAndroid.A((PendingIntent) obj, c6033hj2, null);
            }
        };
        b.getClass();
        ExecutorC9995tF3 executorC9995tF3 = AbstractC10681vF3.a;
        C7027kd2 c7027kd2 = new C7027kd2(executorC9995tF3, interfaceC7371ld2);
        C6561jF3 c6561jF3 = b.b;
        c6561jF3.a(c7027kd2);
        DA1 c = LifecycleCallback.c(new BA1(activity));
        C11710yF3 c11710yF3 = (C11710yF3) c.h(C11710yF3.class, "TaskOnStopCallback");
        if (c11710yF3 == null) {
            c11710yF3 = new C11710yF3(c);
        }
        synchronized (c11710yF3.g) {
            c11710yF3.g.add(new WeakReference(c7027kd2));
        }
        b.i();
        C2612Uc2 c2612Uc2 = new C2612Uc2(executorC9995tF3, new InterfaceC2872Wc2() { // from class: gj2
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                AbstractC4851eH1.a("ParentAuthDelegate", "Failed to launch parent verification widget", exc);
                r1.onResult(Boolean.FALSE);
            }
        });
        c6561jF3.a(c2612Uc2);
        DA1 c2 = LifecycleCallback.c(new BA1(activity));
        C11710yF3 c11710yF32 = (C11710yF3) c2.h(C11710yF3.class, "TaskOnStopCallback");
        if (c11710yF32 == null) {
            c11710yF32 = new C11710yF3(c2);
        }
        synchronized (c11710yF32.g) {
            c11710yF32.g.add(new WeakReference(c2612Uc2));
        }
        b.i();
    }
}
