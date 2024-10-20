package defpackage;

import android.animation.Animator;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.messages.MessageBannerView;
import org.chromium.components.messages.MessageContainer;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class CV1 implements ZW2 {
    public final C7638mO3 a = new C7638mO3(new Runnable() { // from class: zV1
        @Override // java.lang.Runnable
        public final void run() {
            CV1 cv1 = CV1.this;
            cv1.e(cv1.c());
        }
    });
    public final C10411uU1 b = new C10411uU1();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final C4589dX2 f = new C4589dX2(this);

    public final void b(Object obj, C9426rc3 c9426rc3, C5276fX2 c5276fX2, boolean z) {
        HashMap hashMap = this.c;
        if (hashMap.containsKey(obj)) {
            throw new IllegalStateException("Message with the given key has already been enqueued");
        }
        HashMap hashMap2 = this.d;
        List list = (List) hashMap2.get(c5276fX2);
        if (list == null) {
            list = new ArrayList();
            hashMap2.put(c5276fX2, list);
            C4589dX2 c4589dX2 = this.f;
            c4589dX2.getClass();
            int i = c5276fX2.a;
            ZW2 zw2 = c4589dX2.a;
            c4589dX2.b.put(c5276fX2, i == 0 ? new C4245cX2(zw2, c5276fX2) : new C3558aX2(zw2, c5276fX2));
        }
        BV1 bv1 = new BV1(obj, c9426rc3, c5276fX2, z);
        list.add(bv1);
        hashMap.put(obj, bv1);
        BV1 c = c();
        if (c != null) {
            AbstractC4851eH1.f("MessageQueueManager", "Currently displaying message with ID %s and key %s.", Integer.valueOf(((C9426rc3) c.d).a()), c.c);
        }
        e(c);
        if (c == bv1) {
            int a = c9426rc3.a();
            EI2.h(a, 33, "Android.Messages.Enqueued");
            EI2.h(a, 33, "Android.Messages.Enqueued.Visible");
        } else {
            int a2 = c != null ? ((C9426rc3) c.d).a() : 0;
            int a3 = c9426rc3.a();
            EI2.h(a3, 33, "Android.Messages.Enqueued");
            EI2.h(a3, 33, "Android.Messages.Enqueued.Hidden");
            EI2.h(a2, 33, "Android.Messages.Enqueued.Hiding");
        }
    }

    public final void a(BV1 bv1, int i) {
        NV1 nv1 = bv1.d;
        HashMap hashMap = this.d;
        C5276fX2 c5276fX2 = bv1.b;
        List list = (List) hashMap.get(c5276fX2);
        list.remove(bv1);
        AbstractC4851eH1.f("MessageQueueManager", "Removed message with ID %s and key %s from the message queue.", Integer.valueOf(((C9426rc3) bv1.d).a()), bv1.c);
        if (list.isEmpty()) {
            hashMap.remove(c5276fX2);
            ((InterfaceC3902bX2) this.f.b.remove(c5276fX2)).destroy();
        }
        C9426rc3 c9426rc3 = (C9426rc3) nv1;
        Callback callback = (Callback) c9426rc3.d.i(HU1.x);
        if (callback != null) {
            callback.onResult(Integer.valueOf(i));
        }
        c9426rc3.i = true;
        if (i == 1 || i == 2 || i == 4) {
            int a = c9426rc3.a();
            boolean z = i == 4;
            long uptimeMillis = SystemClock.uptimeMillis() - c9426rc3.j;
            String a2 = TV1.a(a);
            EI2.k(uptimeMillis, "Android.Messages.TimeToAction.".concat(a2));
            if (z) {
                EI2.k(uptimeMillis, "Android.Messages.TimeToAction.Dismiss.".concat(a2));
            }
        }
        if (this.b.a == bv1) {
            e(null);
        }
        EI2.h(i, 10, "Android.Messages.Dismissed.".concat(TV1.a(c9426rc3.a())));
    }

    public final void d(GV1 gv1) {
        HashMap hashMap = this.e;
        C5276fX2 c5276fX2 = gv1.b;
        int i = gv1.a;
        if (i != 2) {
            if (i == 1) {
                hashMap.put(c5276fX2, Boolean.FALSE);
                e(c());
                return;
            } else {
                if (i == 0) {
                    hashMap.put(c5276fX2, Boolean.TRUE);
                    e(c());
                    return;
                }
                return;
            }
        }
        List list = (List) this.d.get(c5276fX2);
        hashMap.remove(c5276fX2);
        if (list != null) {
            while (!list.isEmpty()) {
                Object obj = ((BV1) list.get(0)).c;
                HashMap hashMap2 = this.c;
                BV1 bv1 = (BV1) hashMap2.get(obj);
                if (bv1 != null) {
                    hashMap2.remove(obj);
                    a(bv1, 8);
                }
            }
        }
    }

    public final BV1 c() {
        Boolean bool;
        BV1 bv1 = null;
        if (this.a.b()) {
            return null;
        }
        for (List<BV1> list : this.d.values()) {
            if (!list.isEmpty() && (bool = (Boolean) this.e.get(((BV1) list.get(0)).b)) != null && bool.booleanValue()) {
                for (BV1 bv12 : list) {
                    InterfaceC7913nB interfaceC7913nB = (InterfaceC7913nB) ((C9426rc3) bv12.d).d.i(HU1.y);
                    boolean a = interfaceC7913nB != null ? interfaceC7913nB.a() : true;
                    AbstractC4851eH1.f("MessageQueueManager", "MessageStateHandler#shouldShow for message with ID %s and key %s in MessageQueueManager#getNextMessage returned %s.", Integer.valueOf(((C9426rc3) bv12.d).a()), bv12.c, Boolean.valueOf(a));
                    if (a && (bv1 == null || ((bv12.e && !bv1.e) || bv12.a < bv1.a))) {
                        bv1 = bv12;
                    }
                }
            }
        }
        return bv1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AV1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [pc3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [tU1] */
    public final void e(final BV1 bv1) {
        boolean b = this.a.b();
        final ?? r1 = new Runnable() { // from class: AV1
            @Override // java.lang.Runnable
            public final void run() {
                CV1 cv1 = CV1.this;
                cv1.e(cv1.c());
            }
        };
        final C10411uU1 c10411uU1 = this.b;
        BV1 bv12 = c10411uU1.a;
        if (bv12 == bv1) {
            return;
        }
        if (bv12 == null) {
            c10411uU1.a = bv1;
            HO ho = c10411uU1.c;
            Runnable runnable = new Runnable() { // from class: sU1
                /* JADX WARN: Type inference failed for: r10v0, types: [mc3] */
                /* JADX WARN: Type inference failed for: r13v0, types: [nc3] */
                /* JADX WARN: Type inference failed for: r4v1, types: [oc3] */
                @Override // java.lang.Runnable
                public final void run() {
                    C10411uU1 c10411uU12 = C10411uU1.this;
                    if (c10411uU12.a == null) {
                        return;
                    }
                    Object[] objArr = new Object[3];
                    BV1 bv13 = bv1;
                    objArr[0] = Integer.valueOf(((C9426rc3) bv13.d).a());
                    objArr[1] = bv13.c;
                    InterfaceC7913nB interfaceC7913nB = (InterfaceC7913nB) ((C9426rc3) bv13.d).d.i(HU1.y);
                    objArr[2] = Boolean.valueOf(interfaceC7913nB != null ? interfaceC7913nB.a() : true);
                    AbstractC4851eH1.f("MessageQueueManager", "MessageStateHandler#shouldShow for message with ID %s and key %s in MessageQueueManager#updateCurrentDisplayedMessage returned %s.", objArr);
                    final C9426rc3 c9426rc3 = (C9426rc3) c10411uU12.a.d;
                    CU1 cu1 = c9426rc3.a;
                    MessageContainer messageContainer = c9426rc3.c;
                    if (cu1 == null) {
                        MessageBannerView messageBannerView = (MessageBannerView) LayoutInflater.from(messageContainer.getContext()).inflate(R.layout.f58760_resource_name_obfuscated_res_0x7f0e0183, (ViewGroup) messageContainer, false);
                        c9426rc3.b = messageBannerView;
                        c9426rc3.a = new CU1(messageBannerView, c9426rc3.d, c9426rc3.g, messageContainer.getResources(), new Runnable() { // from class: mc3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9426rc3 c9426rc32 = C9426rc3.this;
                                c9426rc32.e.a(4, c9426rc32.d);
                            }
                        }, c9426rc3.h, c9426rc3.f, new Runnable() { // from class: nc3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9426rc3 c9426rc32 = C9426rc3.this;
                                c9426rc32.e.a(3, c9426rc32.d);
                            }
                        });
                    }
                    MessageBannerView messageBannerView2 = c9426rc3.b;
                    if (messageContainer.a != null) {
                        throw new IllegalStateException("Should not contain any view when adding a new message.");
                    }
                    messageContainer.a = messageBannerView2;
                    messageContainer.addView(messageBannerView2);
                    Ge4.f(messageContainer, false);
                    messageContainer.g = c9426rc3;
                    final CU1 cu12 = c9426rc3.a;
                    Objects.requireNonNull(cu12);
                    ?? r4 = new Runnable() { // from class: oc3
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CU1 cu13 = CU1.this;
                            cu13.getClass();
                            Runnable runnable2 = new Runnable() { // from class: wU1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final CU1 cu14 = CU1.this;
                                    final C10754vU1 c10754vU1 = cu14.d;
                                    Objects.requireNonNull(c10754vU1);
                                    Runnable runnable3 = new Runnable() { // from class: zU1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C10754vU1 c10754vU12 = C10754vU1.this;
                                            Runnable runnable4 = c10754vU12.b;
                                            if (runnable4 == null) {
                                                return;
                                            }
                                            c10754vU12.a();
                                            long j = c10754vU12.a;
                                            c10754vU12.a = j;
                                            c10754vU12.b = runnable4;
                                            c10754vU12.c.postDelayed(runnable4, j);
                                        }
                                    };
                                    cu14.a.a.o(HU1.C, runnable3);
                                    cu14.a();
                                    cu14.b.w = new Runnable() { // from class: AU1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            CU1 cu15 = CU1.this;
                                            C10754vU1 c10754vU12 = cu15.d;
                                            Runnable runnable4 = c10754vU12.b;
                                            if (runnable4 != null) {
                                                c10754vU12.a();
                                                long j = c10754vU12.a;
                                                c10754vU12.a = j;
                                                c10754vU12.b = runnable4;
                                                c10754vU12.c.postDelayed(runnable4, j);
                                            }
                                            cu15.a();
                                        }
                                    };
                                    long longValue = ((Long) cu14.e.get()).longValue();
                                    c10754vU1.a = longValue;
                                    Runnable runnable4 = cu14.f;
                                    c10754vU1.b = runnable4;
                                    c10754vU1.c.postDelayed(runnable4, longValue);
                                }
                            };
                            GU1 gu1 = cu13.a;
                            if (gu1.n == 0) {
                                gu1.a.l(HU1.A, -((Integer) gu1.g.get()).intValue());
                            }
                            Animator animator = gu1.m;
                            if (animator != null) {
                                animator.cancel();
                            }
                            gu1.m = null;
                            gu1.b(true, 0.0f, false, runnable2);
                        }
                    };
                    if (messageContainer.a.getHeight() > 0) {
                        r4.run();
                    } else {
                        messageContainer.a.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3547aV1(r4));
                    }
                    c9426rc3.j = SystemClock.uptimeMillis();
                    c10411uU12.b = c10411uU12.a;
                    r1.run();
                }
            };
            CC cc = ho.h;
            if (cc == null) {
                return;
            }
            ho.i = cc.g.v();
            C4234cV1 c4234cV1 = ho.g;
            c4234cV1.a.setVisibility(0);
            c4234cV1.c();
            Tab tab = (Tab) ho.l.g;
            int b2 = (tab == null || C3093Xu3.a(tab) == null) ? 3 : C3093Xu3.a(tab).b();
            GO go = ho.j;
            if (b2 == 2 || HC.a(ho.h)) {
                go.a = null;
                runnable.run();
                return;
            } else {
                go.a = runnable;
                return;
            }
        }
        final ?? r8 = new Runnable() { // from class: tU1
            @Override // java.lang.Runnable
            public final void run() {
                C10411uU1 c10411uU12 = C10411uU1.this;
                HO ho2 = c10411uU12.c;
                CC cc2 = ho2.h;
                if (cc2 != null) {
                    cc2.g.u(ho2.i);
                    ho2.g.a.setVisibility(8);
                    ho2.j.a = null;
                }
                c10411uU12.b = null;
                c10411uU12.a = null;
                r1.run();
            }
        };
        if (c10411uU1.b != bv12) {
            r8.run();
            return;
        }
        boolean z = !b;
        final C9426rc3 c9426rc3 = (C9426rc3) bv12.d;
        c9426rc3.getClass();
        final ?? r3 = new Runnable() { // from class: pc3
            @Override // java.lang.Runnable
            public final void run() {
                C9426rc3 c9426rc32 = C9426rc3.this;
                MessageBannerView messageBannerView = c9426rc32.b;
                MessageContainer messageContainer = c9426rc32.c;
                if (messageContainer.a != messageBannerView) {
                    throw new IllegalStateException("The given view is not being shown.");
                }
                Ge4.f(messageContainer, true);
                messageContainer.removeAllViews();
                messageContainer.a = null;
                messageContainer.g = null;
                Runnable runnable2 = r8;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        final CU1 cu1 = c9426rc3.a;
        cu1.d.a();
        Runnable runnable2 = new Runnable() { // from class: xU1
            @Override // java.lang.Runnable
            public final void run() {
                PD2 pd2 = HU1.C;
                CU1 cu12 = CU1.this;
                cu12.a.a.o(pd2, null);
                cu12.b.w = null;
                r3.run();
            }
        };
        GU1 gu1 = cu1.a;
        Animator animator = gu1.m;
        if (animator != null) {
            animator.cancel();
        }
        gu1.m = null;
        InterfaceC0079Ap3 interfaceC0079Ap3 = gu1.g;
        if (!z) {
            MD2 md2 = HU1.B;
            PropertyModel propertyModel = gu1.a;
            propertyModel.l(md2, 0.0f);
            propertyModel.l(HU1.A, -((Integer) interfaceC0079Ap3.get()).intValue());
            gu1.n = 0;
        }
        if (gu1.n == 0) {
            runnable2.run();
        } else {
            gu1.b(true, -((Integer) interfaceC0079Ap3.get()).intValue(), false, runnable2);
        }
    }
}
