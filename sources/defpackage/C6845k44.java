package defpackage;

import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k44 */
/* loaded from: classes2.dex */
public final class C6845k44 implements InterfaceC3906bY1 {
    public final /* synthetic */ C7189l44 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        C7189l44 c7189l44 = this.a;
        c7189l44.d.onResult(Boolean.FALSE);
        c7189l44.a.b();
    }

    public C6845k44(C7189l44 c7189l44) {
        this.a = c7189l44;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        final C10964w44 b = C10964w44.b();
        boolean z = i == 0;
        C7189l44 c7189l44 = this.a;
        if (z) {
            boolean z2 = !c7189l44.c;
            b.getClass();
            Object obj = ThreadUtils.a;
            R44.a(b.a).e("usage_stats_reporting.enabled", z2);
            if (b.h != z2) {
                b.h = z2;
                b.g.d(z2);
                if (!z2) {
                    b.d.c.f(new C6431is3()).g(new Callback() { // from class: u44
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            List list = (List) obj2;
                            C10964w44 c10964w44 = C10964w44.this;
                            c10964w44.getClass();
                            Object obj3 = ThreadUtils.a;
                            c10964w44.d(list, false);
                            C7806ms3 c7806ms3 = c10964w44.d;
                            c7806ms3.getClass();
                            MC2 mc2 = new MC2();
                            c7806ms3.d.g(new C6774js3(c7806ms3, false, list, mc2));
                            c7806ms3.d = mc2;
                        }
                    });
                    b.e.a.f(new C8326oO3()).g(new Callback() { // from class: v44
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj2) {
                            return new ZE(this, obj2);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj2) {
                            C10964w44 c10964w44 = C10964w44.this;
                            c10964w44.getClass();
                            for (String str : (List) obj2) {
                                Object obj3 = ThreadUtils.a;
                                C10383uO3 c10383uO3 = c10964w44.e;
                                c10383uO3.getClass();
                                c10383uO3.a.h(new C9012qO3(c10383uO3, str, new MC2()), new DD0());
                            }
                        }
                    });
                }
                AbstractC7533m44.a(!z2 ? 1 : 0);
            }
        }
        c7189l44.d.onResult(Boolean.valueOf(z));
        c7189l44.a.b();
    }
}
