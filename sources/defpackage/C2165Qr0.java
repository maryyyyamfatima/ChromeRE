package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemShareInfo;
import org.chromium.components.offline_items_collection.ShareCallback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qr0 */
/* loaded from: classes.dex */
public final class C2165Qr0 {
    public final InterfaceC0079Ap3 a;
    public final PropertyModel b;
    public final String c;
    public final OfflineContentAggregatorBridge d;
    public final ViewOnClickListenerC1069If3 e;
    public final C2035Pr0 f;
    public final Q83 g;
    public final Runnable h;
    public boolean i;
    public boolean j;

    public C2165Qr0(C0276Cd0 c0276Cd0, PropertyModel propertyModel, String str, OfflineContentAggregatorBridge offlineContentAggregatorBridge, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, Q83 q83, RunnableC0346Cr0 runnableC0346Cr0) {
        this.a = c0276Cd0;
        this.b = propertyModel;
        this.c = str;
        this.d = offlineContentAggregatorBridge;
        this.e = viewOnClickListenerC1069If3;
        this.g = q83;
        this.h = runnableC0346Cr0;
        propertyModel.k(GD1.l, true);
        propertyModel.o(GD1.m, new Callback() { // from class: Fr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.getClass();
                C6161i50 c6161i50 = ((OfflineItem) obj).a;
                OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c2165Qr0.d;
                long j = offlineContentAggregatorBridge2.a;
                if (j == 0) {
                    return;
                }
                N.MXureVYk(j, offlineContentAggregatorBridge2, 6, false, c6161i50.a, c6161i50.b);
            }
        });
        propertyModel.o(GD1.n, new Callback() { // from class: Gr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2165Qr0.this.d.a(((OfflineItem) obj).a);
            }
        });
        propertyModel.o(GD1.o, new Callback() { // from class: Hr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                OfflineItem offlineItem = (OfflineItem) obj;
                C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.a(c2165Qr0.i ? 2 : 1);
                c2165Qr0.j = false;
                if (!c2165Qr0.g.n("Chrome.DownloadInterstitial.PendingRemoval")) {
                    AbstractC4851eH1.a("DownloadInterstitial", "Failed to clear DownloadInfo Chrome.DownloadInterstitial.PendingRemoval", new Object[0]);
                }
                c2165Qr0.d.c(offlineItem.a, true);
            }
        });
        propertyModel.o(GD1.p, new Callback() { // from class: Ir0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                OfflineItem offlineItem = (OfflineItem) obj;
                C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.getClass();
                c2165Qr0.b(offlineItem.a);
                c2165Qr0.d.a(offlineItem.a);
                c2165Qr0.a(3);
            }
        });
        propertyModel.o(GD1.q, new Callback() { // from class: Jr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.getClass();
                final HashSet d = AbstractC9048qW.d((OfflineItem) obj);
                final ArrayList arrayList = new ArrayList();
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    final OfflineItem offlineItem = (OfflineItem) it.next();
                    C6161i50 c6161i50 = offlineItem.a;
                    ShareCallback shareCallback = new ShareCallback() { // from class: Or0
                        @Override // org.chromium.components.offline_items_collection.ShareCallback
                        public final void a(OfflineItemShareInfo offlineItemShareInfo) {
                            Intent a;
                            C2165Qr0 c2165Qr02 = C2165Qr0.this;
                            c2165Qr02.getClass();
                            C8776pi2 c8776pi2 = new C8776pi2(offlineItem, offlineItemShareInfo);
                            Collection collection = arrayList;
                            collection.add(c8776pi2);
                            if (collection.size() != d.size() || (a = AbstractC7556m83.a(collection)) == null) {
                                return;
                            }
                            InterfaceC0079Ap3 interfaceC0079Ap3 = c2165Qr02.a;
                            try {
                                ((Context) interfaceC0079Ap3.get()).startActivity(Intent.createChooser(a, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140a1a)));
                            } catch (ActivityNotFoundException unused) {
                                AbstractC4851eH1.a("DownloadInterstitial", "Cannot find activity for sharing", new Object[0]);
                            } catch (Exception e) {
                                AbstractC4851eH1.a("DownloadInterstitial", "Cannot start activity for sharing, exception: " + e, new Object[0]);
                            }
                        }
                    };
                    OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c2165Qr0.d;
                    N.M8AqLjBj(offlineContentAggregatorBridge2.a, offlineContentAggregatorBridge2, c6161i50.a, c6161i50.b, shareCallback);
                }
            }
        });
        propertyModel.o(GD1.r, new Callback() { // from class: Kr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.j = true;
                c2165Qr0.b(((OfflineItem) obj).a);
                c2165Qr0.e.c(C12188zf3.a(((Context) c2165Qr0.a.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f1403ed, ((OfflineItem) c2165Qr0.b.i(InterfaceC2295Rr0.a)).g), null, 0, 52));
                c2165Qr0.a(3);
            }
        });
        propertyModel.o(GD1.t, new FD1() { // from class: Lr0
            @Override // defpackage.FD1
            public final Runnable a(OfflineItem offlineItem, int i, int i2, C9419rb2 c9419rb2) {
                return new RunnableC12082zL2();
            }
        });
        propertyModel.o(GD1.s, new Callback() { // from class: Mr0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final OfflineItem offlineItem = (OfflineItem) obj;
                final C2165Qr0 c2165Qr0 = C2165Qr0.this;
                c2165Qr0.getClass();
                String str2 = ((OfflineItem) c2165Qr0.b.i(InterfaceC2295Rr0.a)).g;
                InterfaceC4882eN2 interfaceC4882eN2 = new InterfaceC4882eN2() { // from class: Nr0
                    @Override // defpackage.InterfaceC4882eN2
                    public final void a(C4539dN2 c4539dN2, String str3) {
                        OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = C2165Qr0.this.d;
                        C6161i50 c6161i50 = offlineItem.a;
                        N.MnGmsa$g(offlineContentAggregatorBridge2.a, offlineContentAggregatorBridge2, c6161i50.a, c6161i50.b, str3, c4539dN2);
                    }
                };
                InterfaceC0079Ap3 interfaceC0079Ap3 = c2165Qr0.a;
                C5226fN2 c5226fN2 = new C5226fN2((Context) interfaceC0079Ap3.get(), new ZX1(new C4998ej((Context) interfaceC0079Ap3.get())));
                c5226fN2.f = interfaceC4882eN2;
                c5226fN2.c = str2;
                c5226fN2.d = str2;
                c5226fN2.e = 0;
                c5226fN2.g = 0;
                c5226fN2.a(1, 3);
            }
        });
        C2035Pr0 c2035Pr0 = new C2035Pr0(this);
        this.f = c2035Pr0;
        offlineContentAggregatorBridge.b.a(c2035Pr0);
    }

    public final void a(int i) {
        ND2 nd2 = InterfaceC2295Rr0.b;
        PropertyModel propertyModel = this.b;
        propertyModel.m(nd2, i);
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.a;
        if (i == 1) {
            propertyModel.o(InterfaceC2295Rr0.c, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140453));
            propertyModel.k(InterfaceC2295Rr0.d, false);
            propertyModel.o(InterfaceC2295Rr0.h, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140447));
            propertyModel.o(InterfaceC2295Rr0.i, (Callback) propertyModel.i(GD1.p));
            propertyModel.k(InterfaceC2295Rr0.g, true);
            return;
        }
        if (i == 2) {
            propertyModel.o(InterfaceC2295Rr0.c, ((Context) interfaceC0079Ap3.get()).getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120012, 1));
            propertyModel.o(InterfaceC2295Rr0.e, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140725));
            propertyModel.o(InterfaceC2295Rr0.f, (Callback) propertyModel.i(GD1.m));
            propertyModel.k(InterfaceC2295Rr0.d, true);
            propertyModel.o(InterfaceC2295Rr0.h, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f1403ec));
            propertyModel.o(InterfaceC2295Rr0.i, (Callback) propertyModel.i(GD1.r));
            propertyModel.k(InterfaceC2295Rr0.g, true);
            this.i = true;
            return;
        }
        PD2 pd2 = GD1.o;
        if (i == 3) {
            propertyModel.o(InterfaceC2295Rr0.c, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140620));
            propertyModel.o(InterfaceC2295Rr0.e, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140620));
            propertyModel.o(InterfaceC2295Rr0.f, (Callback) propertyModel.i(pd2));
            propertyModel.k(InterfaceC2295Rr0.d, true);
            propertyModel.k(InterfaceC2295Rr0.g, false);
            return;
        }
        if (i != 4) {
            return;
        }
        propertyModel.o(InterfaceC2295Rr0.c, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140620));
        propertyModel.o(InterfaceC2295Rr0.e, ((Context) interfaceC0079Ap3.get()).getString(R.string.0_resource_name_obfuscated_res_0x7f140451));
        propertyModel.o(InterfaceC2295Rr0.f, (Callback) propertyModel.i(pd2));
        propertyModel.k(InterfaceC2295Rr0.d, true);
        propertyModel.k(InterfaceC2295Rr0.g, false);
    }

    public final void b(C6161i50 c6161i50) {
        if (this.g.v("Chrome.DownloadInterstitial.PendingRemoval", String.format("%s,%s", c6161i50.a, c6161i50.b))) {
            return;
        }
        AbstractC4851eH1.a("DownloadInterstitial", "Failed to write DownloadInfo Chrome.DownloadInterstitial.PendingRemoval", new Object[0]);
    }
}
