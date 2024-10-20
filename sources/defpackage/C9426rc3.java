package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.components.messages.MessageBannerView;
import org.chromium.components.messages.MessageContainer;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rc3 */
/* loaded from: classes2.dex */
public final class C9426rc3 implements NV1, InterfaceC3891bV1 {
    public CU1 a;
    public MessageBannerView b;
    public final MessageContainer c;
    public final PropertyModel d;
    public final InterfaceC9084qc3 e;
    public final C6678jc3 f;
    public final InterfaceC0079Ap3 g;
    public final Callback h;
    public boolean i;
    public long j;

    public C9426rc3(MessageContainer messageContainer, PropertyModel propertyModel, InterfaceC9084qc3 interfaceC9084qc3, InterfaceC0079Ap3 interfaceC0079Ap3, C12094zO c12094zO, Callback callback) {
        ED2 ed2;
        this.d = propertyModel;
        this.c = messageContainer;
        this.e = interfaceC9084qc3;
        this.g = interfaceC0079Ap3;
        this.h = callback;
        ArrayList b = propertyModel.b();
        OD2 od2 = HU1.w;
        long j = 0;
        if (b.contains(od2) && (ed2 = (ED2) propertyModel.b.get(od2)) != null) {
            j = ed2.a;
        }
        this.f = new C6678jc3(c12094zO, propertyModel, j);
        propertyModel.o(HU1.D, new View.OnClickListener() { // from class: kc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9426rc3 c9426rc3 = C9426rc3.this;
                if (c9426rc3.i) {
                    return;
                }
                PD2 pd2 = HU1.d;
                PropertyModel propertyModel2 = c9426rc3.d;
                if (((Integer) ((InterfaceC0079Ap3) propertyModel2.i(pd2)).get()).intValue() == 1) {
                    c9426rc3.e.a(1, propertyModel2);
                }
            }
        });
        propertyModel.o(HU1.E, new Runnable() { // from class: lc3
            @Override // java.lang.Runnable
            public final void run() {
                C9426rc3 c9426rc3 = C9426rc3.this;
                if (c9426rc3.i) {
                    return;
                }
                ((Runnable) c9426rc3.d.i(HU1.e)).run();
            }
        });
    }

    public final int a() {
        return Integer.valueOf(this.d.h(HU1.a)).intValue();
    }
}
