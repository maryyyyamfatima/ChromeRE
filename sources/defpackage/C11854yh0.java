package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.android.chrome.R;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemShareInfo;
import org.chromium.components.offline_items_collection.ShareCallback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yh0 */
/* loaded from: classes.dex */
public final class C11854yh0 {
    public final Handler a = new Handler();
    public final OfflineContentAggregatorBridge b;
    public final C4168cI0 c;
    public final C3020Xg0 d;
    public final PC1 e;
    public final C8491os0 f;
    public final C3020Xg0 g;
    public final C5985hb2 h;
    public final C7237lD1 i;
    public final IL3 j;
    public final C7526m33 k;
    public final C0351Cs0 l;
    public final C9477rl0 m;
    public final C8037nZ3 n;
    public final C6134i03 o;

    public C11854yh0(OfflineContentAggregatorBridge offlineContentAggregatorBridge, C4168cI0 c4168cI0, C3020Xg0 c3020Xg0, C8491os0 c8491os0, C3020Xg0 c3020Xg02, C7526m33 c7526m33, C0351Cs0 c0351Cs0, C9177qs0 c9177qs0, PC1 pc1, C1241Jo0 c1241Jo0) {
        this.b = offlineContentAggregatorBridge;
        this.c = c4168cI0;
        this.d = c3020Xg0;
        this.e = pc1;
        this.f = c8491os0;
        this.g = c3020Xg02;
        this.k = c7526m33;
        this.l = c0351Cs0;
        C5985hb2 c5985hb2 = new C5985hb2(offlineContentAggregatorBridge);
        this.h = c5985hb2;
        OTRProfileID oTRProfileID = OTRProfileID.b;
        C1387Kr1 c1387Kr1 = new C1387Kr1(new C0003Aa2(c0351Cs0.a != null, c5985hb2));
        C9477rl0 c9477rl0 = new C9477rl0(c1387Kr1);
        this.m = c9477rl0;
        C6134i03 c6134i03 = new C6134i03(c9477rl0);
        this.o = c6134i03;
        C8037nZ3 c8037nZ3 = new C8037nZ3(c6134i03);
        this.n = c8037nZ3;
        C4722du1 c4722du1 = new C4722du1(c0351Cs0);
        final C7237lD1 c7237lD1 = new C7237lD1(c0351Cs0, c4722du1, new C0036Ah0(c8037nZ3, pc1, c4722du1), pc1);
        this.i = c7237lD1;
        new C6671jb2(c0351Cs0, c1387Kr1);
        c6134i03.a(new C11168wh0(c6134i03, c9177qs0));
        this.j = new IL3(c1241Jo0);
        new C11511xh0(this, c7526m33);
        PropertyModel propertyModel = pc1.i;
        propertyModel.k(GD1.l, true);
        propertyModel.o(GD1.m, new Callback() { // from class: bh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                OfflineItem offlineItem = (OfflineItem) obj;
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(0);
                OTRProfileID oTRProfileID2 = c11854yh0.l.a;
                OTRProfileID oTRProfileID3 = OTRProfileID.b;
                boolean z = oTRProfileID2 != null;
                C6161i50 c6161i50 = offlineItem.a;
                OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c11854yh0.b;
                long j = offlineContentAggregatorBridge2.a;
                if (j == 0) {
                    return;
                }
                N.MXureVYk(j, offlineContentAggregatorBridge2, 0, z, c6161i50.a, c6161i50.b);
            }
        });
        propertyModel.o(GD1.n, new Callback() { // from class: mh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(2);
                c11854yh0.b.a(((OfflineItem) obj).a);
            }
        });
        propertyModel.o(GD1.o, new Callback() { // from class: nh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(1);
                c11854yh0.b.c(((OfflineItem) obj).a, true);
            }
        });
        propertyModel.o(GD1.p, new Callback() { // from class: oh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(3);
                C6161i50 c6161i50 = ((OfflineItem) obj).a;
                OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c11854yh0.b;
                long j = offlineContentAggregatorBridge2.a;
                if (j == 0) {
                    return;
                }
                N.Mwk11G0z(j, offlineContentAggregatorBridge2, c6161i50.a, c6161i50.b);
            }
        });
        propertyModel.o(GD1.q, new Callback() { // from class: ph0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(4);
                c11854yh0.b(AbstractC9048qW.d((OfflineItem) obj));
            }
        });
        propertyModel.o(GD1.r, new Callback() { // from class: qh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(5);
                c11854yh0.a(Collections.singletonList((OfflineItem) obj));
            }
        });
        propertyModel.o(GD1.t, new FD1() { // from class: rh0
            @Override // defpackage.FD1
            public final Runnable a(final OfflineItem offlineItem, int i, int i2, final C9419rb2 c9419rb2) {
                final C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                int i3 = AbstractC7853n04.a;
                int i4 = offlineItem.i;
                boolean z = true;
                if (i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
                    z = false;
                }
                if (!z || i == 0 || i2 == 0) {
                    c11854yh0.a.post(new Runnable() { // from class: ih0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c9419rb2.f(offlineItem.a, null);
                        }
                    });
                    return new RunnableC12082zL2();
                }
                OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c11854yh0.b;
                c11854yh0.l.getClass();
                final ML3 ml3 = new ML3(offlineContentAggregatorBridge2, offlineItem, i, i2, c9419rb2);
                IL3 il3 = c11854yh0.j;
                il3.getClass();
                Object obj = ThreadUtils.a;
                if (!TextUtils.isEmpty(ml3.a())) {
                    if (il3.c.b(ml3.a()) != null) {
                        ml3.a();
                        ml3.b(null);
                    } else {
                        Bitmap a = il3.a(i, ml3.a());
                        if (a != null) {
                            ml3.a();
                            ml3.b(a);
                        } else {
                            il3.d.offer(ml3);
                            PostTask.c(AbstractC5103f04.a, new GL3(il3));
                        }
                    }
                }
                return new Runnable() { // from class: jh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        IL3 il32 = C11854yh0.this.j;
                        il32.getClass();
                        Object obj2 = ThreadUtils.a;
                        ArrayDeque arrayDeque = il32.d;
                        ML3 ml32 = ml3;
                        if (arrayDeque.contains(ml32)) {
                            arrayDeque.remove(ml32);
                        }
                    }
                };
            }
        });
        propertyModel.o(GD1.u, new C9796sh0(this));
        propertyModel.o(GD1.v, new Callback() { // from class: ch0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0.this.k.g((OC1) obj);
            }
        });
        propertyModel.o(GD1.s, new Callback() { // from class: dh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                OfflineItem offlineItem = (OfflineItem) obj;
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                A04.b(7);
                String str = offlineItem.g;
                final C5675gh0 c5675gh0 = new C5675gh0(c11854yh0, offlineItem);
                C3613ah0 c3613ah0 = c11854yh0.g.a;
                c3613ah0.getClass();
                InterfaceC4882eN2 interfaceC4882eN2 = new InterfaceC4882eN2() { // from class: Zg0
                    @Override // defpackage.InterfaceC4882eN2
                    public final void a(C4539dN2 c4539dN2, String str2) {
                        C5675gh0 c5675gh02 = C5675gh0.this;
                        OfflineContentAggregatorBridge offlineContentAggregatorBridge2 = c5675gh02.a.b;
                        C6161i50 c6161i50 = c5675gh02.b.a;
                        N.MnGmsa$g(offlineContentAggregatorBridge2.a, offlineContentAggregatorBridge2, c6161i50.a, c6161i50.b, str2, c4539dN2);
                    }
                };
                C5226fN2 c5226fN2 = c3613ah0.d;
                c5226fN2.f = interfaceC4882eN2;
                c5226fN2.c = str;
                c5226fN2.d = str;
                c5226fN2.e = 0;
                c5226fN2.g = 0;
                c5226fN2.a(1, 3);
            }
        });
        propertyModel.o(GD1.x, new Runnable() { // from class: kh0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC12197zh0 interfaceC12197zh0;
                C7237lD1 c7237lD12 = C7237lD1.this;
                if (c7237lD12.k == 7) {
                    interfaceC12197zh0 = c7237lD12.h;
                } else {
                    interfaceC12197zh0 = c7237lD12.e;
                }
                interfaceC12197zh0.c();
                c7237lD12.b.a();
            }
        });
        propertyModel.o(GD1.y, new Callback() { // from class: lh0
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Pair pair = (Pair) obj;
                C7237lD1 c7237lD12 = C7237lD1.this;
                HashMap hashMap = c7237lD12.j.a;
                hashMap.put(pair, Integer.valueOf((hashMap.containsKey(pair) ? ((Integer) hashMap.get(pair)).intValue() : 1) + 1));
                c7237lD12.b.a();
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    public final void b(final AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (offlineItem.i == 0) {
                FI2.a("OfflinePages.Sharing.SharePageFromDownloadHome");
            }
            EI2.h(HN0.a(offlineItem).intValue(), 8, "Android.DownloadManager.Share.FileTypes");
        }
        EI2.i(abstractCollection.size(), 1, 20, 20, "Android.DownloadManager.Share.Count");
        N63.d(0);
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = abstractCollection.iterator();
        while (it2.hasNext()) {
            final OfflineItem offlineItem2 = (OfflineItem) it2.next();
            C6161i50 c6161i50 = offlineItem2.a;
            ShareCallback shareCallback = new ShareCallback() { // from class: eh0
                @Override // org.chromium.components.offline_items_collection.ShareCallback
                public final void a(OfflineItemShareInfo offlineItemShareInfo) {
                    Intent a;
                    C11854yh0 c11854yh0 = C11854yh0.this;
                    c11854yh0.getClass();
                    C8776pi2 c8776pi2 = new C8776pi2(offlineItem2, offlineItemShareInfo);
                    Collection collection = arrayList;
                    collection.add(c8776pi2);
                    if (collection.size() != abstractCollection.size() || (a = AbstractC7556m83.a(collection)) == null) {
                        return;
                    }
                    C3613ah0 c3613ah0 = c11854yh0.d.a;
                    c3613ah0.getClass();
                    try {
                        Context context = c3613ah0.a;
                        context.startActivity(Intent.createChooser(a, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140a1a)));
                    } catch (ActivityNotFoundException unused) {
                        AbstractC4851eH1.a("DownloadHome", "Cannot find activity for sharing", new Object[0]);
                    } catch (Exception e) {
                        AbstractC4851eH1.a("DownloadHome", "Cannot start activity for sharing, exception: " + e, new Object[0]);
                    }
                }
            };
            OfflineContentAggregatorBridge offlineContentAggregatorBridge = this.b;
            N.M8AqLjBj(offlineContentAggregatorBridge.a, offlineContentAggregatorBridge, c6161i50.a, c6161i50.b, shareCallback);
        }
    }

    public final void a(List list) {
        String string;
        String string2;
        Collection<OfflineItem> h = this.h.h();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (!TextUtils.isEmpty(offlineItem.v)) {
                hashSet.add(offlineItem.v);
            }
        }
        final HashSet hashSet2 = new HashSet(list);
        for (OfflineItem offlineItem2 : h) {
            if (hashSet.contains(offlineItem2.v)) {
                hashSet2.add(offlineItem2);
            }
        }
        C9477rl0 c9477rl0 = this.m;
        c9477rl0.getClass();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            c9477rl0.i.add(((OfflineItem) it2.next()).a);
        }
        c9477rl0.k();
        Callback callback = new Callback() { // from class: fh0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C11854yh0 c11854yh0 = C11854yh0.this;
                c11854yh0.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Collection collection = hashSet2;
                if (booleanValue) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        c11854yh0.b.b(((OfflineItem) it3.next()).a);
                    }
                    return;
                }
                C9477rl0 c9477rl02 = c11854yh0.m;
                c9477rl02.getClass();
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    c9477rl02.i.remove(((OfflineItem) it4.next()).a);
                }
                c9477rl02.k();
            }
        };
        C9135ql0 c9135ql0 = this.f.a;
        c9135ql0.getClass();
        C12188zf3 a = C12188zf3.a(V04.a(list), c9135ql0.b, 0, 13);
        a.d = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
        a.e = callback;
        Context context = V60.a;
        if (list.size() == 1) {
            string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f1403ed);
        } else {
            string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b74);
        }
        a.c = string;
        String a2 = V04.a(list);
        Context context2 = V60.a;
        if (list.size() == 1) {
            string2 = context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b71, a2);
        } else {
            string2 = context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140b75, a2);
        }
        a.f = string2;
        c9135ql0.a.c(a);
    }
}
