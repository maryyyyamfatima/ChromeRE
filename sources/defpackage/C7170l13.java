package defpackage;

import J.N;
import android.content.res.Resources;
import android.os.SystemClock;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l13 */
/* loaded from: classes.dex */
public final class C7170l13 implements InterfaceC11609xx3 {
    public OK0 a;
    public final /* synthetic */ SectionHeaderView g;

    public C7170l13(SectionHeaderView sectionHeaderView) {
        this.g = sectionHeaderView;
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        C0639Ex3 c0639Ex3 = c0249Bx3.h;
        SectionHeaderView sectionHeaderView = this.g;
        Resources resources = sectionHeaderView.getResources();
        Resources.Theme theme = sectionHeaderView.getContext().getTheme();
        ThreadLocal threadLocal = GP2.a;
        c0639Ex3.setBackground(resources.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0901b4, theme));
        OK0 ok0 = this.a;
        if (ok0 != null) {
            int i = c0249Bx3.e;
            SK0 sk0 = ok0.a;
            C12042zD2 c12042zD2 = (C12042zD2) sk0.k.i(AbstractC4077c13.b);
            sk0.k.m(AbstractC4077c13.c, i);
            int i2 = 0;
            ((PropertyModel) c12042zD2.get(i)).k(AbstractC4421d13.b, false);
            AbstractC4860eJ0.c(i);
            FeedStream feedStream = (FeedStream) ((InterfaceC1623Mm3) sk0.F.get(Integer.valueOf(i)));
            if (feedStream.h()) {
                ((PropertyModel) c12042zD2.get(i)).o(AbstractC4421d13.c, Ve4.VISIBLE);
            }
            if (sk0.H) {
                return;
            }
            OJ0 oj0 = sk0.a.I;
            if (oj0 != null) {
                oj0.a(32, false);
                int i3 = feedStream.f;
                if (i3 == 1) {
                    i2 = 1;
                } else if (i3 == 2) {
                    i2 = 2;
                }
                oj0.a.b(i2, SystemClock.elapsedRealtimeNanos());
            }
            sk0.d(feedStream, true);
        }
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
        c0249Bx3.h.setBackground(null);
        OK0 ok0 = this.a;
        if (ok0 != null) {
            int i = c0249Bx3.e;
            SK0 sk0 = ok0.a;
            PropertyModel propertyModel = (PropertyModel) ((C12042zD2) sk0.k.i(AbstractC4077c13.b)).get(i);
            if (((FeedStream) ((InterfaceC1623Mm3) sk0.F.get(Integer.valueOf(i)))).h()) {
                propertyModel.o(AbstractC4421d13.c, Ve4.INVISIBLE);
                propertyModel.k(AbstractC4421d13.d, false);
            }
            sk0.m.d.k(GJ0.a, false);
        }
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
        OK0 ok0 = this.a;
        if (ok0 != null) {
            int i = c0249Bx3.e;
            SK0 sk0 = ok0.a;
            if (((FeedStream) ((InterfaceC1623Mm3) sk0.F.get(Integer.valueOf(i)))).h()) {
                ((PropertyModel) ((C12042zD2) sk0.k.i(AbstractC4077c13.b)).get(i)).k(AbstractC4421d13.d, !r9.j(r1));
                FJ0 fj0 = sk0.m;
                PropertyModel propertyModel = fj0.d;
                LD2 ld2 = GJ0.a;
                boolean j = propertyModel.j(ld2);
                if (!j) {
                    int M3tcgrxA = N.M3tcgrxA();
                    Iterator it = fj0.c.iterator();
                    while (it.hasNext()) {
                        PropertyModel propertyModel2 = (PropertyModel) it.next();
                        propertyModel2.k(OK.f, propertyModel2.h(OK.e) == M3tcgrxA);
                    }
                }
                propertyModel.k(ld2, !j);
            }
        }
    }
}
