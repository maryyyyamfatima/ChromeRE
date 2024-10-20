package defpackage;

import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wt3 */
/* loaded from: classes.dex */
public final class C11243wt3 implements InterfaceC1528Lt3, H14 {
    public static final K14 i = new K14(C11243wt3.class);
    public final int a;
    public final InterfaceC4578dV1 g;
    public final PropertyModel h;

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public C11243wt3(InterfaceC4578dV1 interfaceC4578dV1, ChromeTabbedActivity chromeTabbedActivity) {
        String c;
        String string;
        int a = AbstractC2308Rt3.a();
        int i2 = AbstractC0619Et3.b;
        if (a == 7) {
            c = chromeTabbedActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b0a);
        } else {
            c = AbstractC2308Rt3.c(chromeTabbedActivity, a);
        }
        String b = AbstractC2308Rt3.b(chromeTabbedActivity, a);
        if (a == 2 || a == 3 || a == 4 || a == 5) {
            string = chromeTabbedActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b5e);
        } else {
            string = chromeTabbedActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140727);
        }
        Resources resources = chromeTabbedActivity.getResources();
        BD2 bd2 = new BD2(HU1.F);
        bd2.c(HU1.a, 17);
        bd2.e(HU1.f, b);
        bd2.e(HU1.h, c);
        bd2.e(HU1.c, string);
        bd2.e(HU1.l, AbstractC9771sd.c(resources, R.drawable.0_resource_name_obfuscated_res_0x7f090329, 0));
        bd2.c(HU1.p, chromeTabbedActivity.getColor(R.color.0_resource_name_obfuscated_res_0x7f07012e));
        bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: ut3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                C11243wt3 c11243wt3 = C11243wt3.this;
                AbstractC0619Et3.c(c11243wt3.a);
                c11243wt3.b(2);
                return 1;
            }
        });
        bd2.e(HU1.x, new Callback() { // from class: vt3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C11243wt3 c11243wt3 = C11243wt3.this;
                c11243wt3.getClass();
                if (intValue != 3 && intValue != 4 && intValue != 1) {
                    int i3 = AbstractC0619Et3.b;
                    O83.a.m("sync_error_infobar_shown_shown_at_time");
                }
                AbstractC1658Mt3.b().l(c11243wt3);
                C11243wt3.i.b(c11243wt3);
                if (intValue == 4) {
                    c11243wt3.b(1);
                }
            }
        });
        PropertyModel a2 = bd2.a();
        this.h = a2;
        this.g = interfaceC4578dV1;
        ((C5265fV1) interfaceC4578dV1).c(a2, false);
        this.a = AbstractC0619Et3.b(a);
        AbstractC1658Mt3.b().a(this);
        O83.a.s(System.currentTimeMillis(), "sync_error_infobar_shown_shown_at_time");
        b(0);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        if (this.a != AbstractC0619Et3.b(AbstractC2308Rt3.a())) {
            ((C5265fV1) this.g).a(0, this.h);
        }
    }

    public final void b(int i2) {
        EI2.h(i2, 3, "Signin.SyncErrorMessage.".concat(AbstractC0619Et3.a(this.a)));
    }

    public static void a(C10285u6 c10285u6, ChromeTabbedActivity chromeTabbedActivity) {
        TraceEvent i2 = TraceEvent.i("SyncErrorMessage.maybeShowMessageUi", null);
        try {
            boolean z = false;
            if (AbstractC0619Et3.b(AbstractC2308Rt3.a()) != -1) {
                if (System.currentTimeMillis() - O83.a.g(0L, "sync_error_infobar_shown_shown_at_time") > AbstractC0619Et3.a) {
                    z = true;
                }
            }
            if (!z) {
                if (i2 != null) {
                    i2.close();
                    return;
                }
                return;
            }
            InterfaceC4578dV1 a = AbstractC5609gV1.a(c10285u6);
            if (a == null) {
                if (i2 != null) {
                    i2.close();
                    return;
                }
                return;
            }
            J14 j14 = c10285u6.t;
            K14 k14 = i;
            if (k14.e(j14) != null) {
                if (i2 != null) {
                    i2.close();
                }
            } else {
                k14.a(new C11243wt3(a, chromeTabbedActivity), j14);
                if (i2 != null) {
                    i2.close();
                }
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
