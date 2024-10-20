package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Er0 */
/* loaded from: classes.dex */
public final class C0606Er0 {
    public final C2685Ur0 a;
    public final C2165Qr0 b;
    public final UD2 c;

    public C0606Er0(C0276Cd0 c0276Cd0, String str, OfflineContentAggregatorBridge offlineContentAggregatorBridge, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, RunnableC0346Cr0 runnableC0346Cr0) {
        Context context = (Context) c0276Cd0.get();
        C2685Ur0 c2685Ur0 = new C2685Ur0(context, LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00d7, (ViewGroup) null));
        this.a = c2685Ur0;
        PropertyModel propertyModel = new PropertyModel(PropertyModel.e(InterfaceC2295Rr0.k));
        this.b = new C2165Qr0(c0276Cd0, propertyModel, str, offlineContentAggregatorBridge, viewOnClickListenerC1069If3, O83.a, runnableC0346Cr0);
        this.c = UD2.a(propertyModel, c2685Ur0, new TD2() { // from class: Dr0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                C2685Ur0 c2685Ur02 = (C2685Ur0) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = InterfaceC2295Rr0.a;
                if (fd2.equals(pd2) || fd2.equals(InterfaceC2295Rr0.b)) {
                    OfflineItem offlineItem = (OfflineItem) propertyModel2.i(pd2);
                    c2685Ur02.getClass();
                    ND2 nd2 = InterfaceC2295Rr0.b;
                    if (propertyModel2.h(nd2) == 3) {
                        offlineItem.B = 3;
                    } else if (propertyModel2.h(nd2) == 2) {
                        offlineItem.B = 2;
                    }
                    int i = offlineItem.B;
                    C3291Zi1 c3291Zi1 = c2685Ur02.d;
                    C5967hY0 c5967hY0 = c2685Ur02.c;
                    if (i == 2) {
                        c3291Zi1.a.setVisibility(8);
                        c5967hY0.a.setVisibility(0);
                        c5967hY0.v(propertyModel2, new KC1(offlineItem));
                        return;
                    } else {
                        c5967hY0.a.setVisibility(8);
                        c3291Zi1.a.setVisibility(0);
                        c3291Zi1.v(propertyModel2, new KC1(offlineItem));
                        return;
                    }
                }
                PD2 pd22 = InterfaceC2295Rr0.c;
                if (!fd2.equals(pd22)) {
                    LD2 ld2 = InterfaceC2295Rr0.d;
                    if (!fd2.equals(ld2)) {
                        PD2 pd23 = InterfaceC2295Rr0.e;
                        if (!fd2.equals(pd23)) {
                            PD2 pd24 = InterfaceC2295Rr0.f;
                            if (fd2.equals(pd24)) {
                                final Runnable e0 = ((Callback) propertyModel2.i(pd24)).e0((OfflineItem) propertyModel2.i(pd2));
                                c2685Ur02.e.setOnClickListener(new View.OnClickListener() { // from class: Sr0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        e0.run();
                                    }
                                });
                                return;
                            }
                            LD2 ld22 = InterfaceC2295Rr0.g;
                            if (fd2.equals(ld22)) {
                                c2685Ur02.f.setVisibility(propertyModel2.j(ld22) ? 0 : 4);
                                return;
                            }
                            PD2 pd25 = InterfaceC2295Rr0.h;
                            if (!fd2.equals(pd25)) {
                                PD2 pd26 = InterfaceC2295Rr0.i;
                                if (fd2.equals(pd26)) {
                                    final Runnable e02 = ((Callback) propertyModel2.i(pd26)).e0((OfflineItem) propertyModel2.i(pd2));
                                    c2685Ur02.f.setOnClickListener(new View.OnClickListener() { // from class: Tr0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            e02.run();
                                        }
                                    });
                                    return;
                                } else {
                                    if (fd2.equals(InterfaceC2295Rr0.j)) {
                                        c2685Ur02.a.findViewById(R.id.loading_message).setVisibility(8);
                                        return;
                                    }
                                    return;
                                }
                            }
                            c2685Ur02.f.setText((String) propertyModel2.i(pd25));
                            return;
                        }
                        c2685Ur02.e.setText((String) propertyModel2.i(pd23));
                        return;
                    }
                    c2685Ur02.e.setVisibility(propertyModel2.j(ld2) ? 0 : 4);
                    return;
                }
                c2685Ur02.b.setText((String) propertyModel2.i(pd22));
            }
        });
    }
}
