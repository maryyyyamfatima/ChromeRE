package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nx2 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1807Nx2 implements Runnable {
    public final /* synthetic */ InterfaceC0984Ho3 a;
    public final /* synthetic */ BookmarkBridge g;

    public /* synthetic */ RunnableC1807Nx2(BookmarkBridge bookmarkBridge, C3063Xo3 c3063Xo3) {
        this.a = c3063Xo3;
        this.g = bookmarkBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final BookmarkBridge bookmarkBridge = this.g;
        final InterfaceC0984Ho3 interfaceC0984Ho3 = this.a;
        ((C3063Xo3) interfaceC0984Ho3).a("PRICE_TRACK", true, new Callback() { // from class: Px2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i;
                C10993w93 c10993w93;
                List<CommerceSubscription> list = (List) obj;
                BookmarkBridge bookmarkBridge2 = BookmarkBridge.this;
                if (bookmarkBridge2.a || list == null) {
                    return;
                }
                int i2 = 2;
                ArrayList p = bookmarkBridge2.p("", 2, -1);
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                for (CommerceSubscription commerceSubscription : list) {
                    if ("USER_MANAGED".equals(commerceSubscription.d)) {
                        long b = S14.b(commerceSubscription.c);
                        hashSet.add(Long.valueOf(b));
                        hashMap.put(Long.valueOf(b), commerceSubscription);
                    }
                }
                Iterator it = p.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BookmarkId bookmarkId = (BookmarkId) it.next();
                    C0768Fx2 j = bookmarkBridge2.j(bookmarkId);
                    int a = AbstractC1418Kx2.a(j.n);
                    if ((a != 0 ? a : 1) == 2) {
                        if (j.k == 5) {
                            c10993w93 = (C10993w93) j.l;
                        } else {
                            c10993w93 = C10993w93.r;
                        }
                        if (c10993w93.o) {
                            if (hashSet.contains(Long.valueOf(c10993w93.n))) {
                                hashMap.remove(Long.valueOf(c10993w93.n));
                            } else {
                                C10650v93 c10650v93 = (C10650v93) C10993w93.r.k(c10993w93);
                                if (c10650v93.h) {
                                    c10650v93.l();
                                    c10650v93.h = false;
                                }
                                C10993w93 c10993w932 = (C10993w93) c10650v93.g;
                                c10993w932.j |= 16;
                                c10993w932.o = false;
                                C10993w93 c10993w933 = (C10993w93) c10650v93.j();
                                C0508Dx2 c0508Dx2 = (C0508Dx2) C0768Fx2.o.k(j);
                                if (c0508Dx2.h) {
                                    c0508Dx2.l();
                                    c0508Dx2.h = false;
                                }
                                C0768Fx2 c0768Fx2 = (C0768Fx2) c0508Dx2.g;
                                c0768Fx2.getClass();
                                c10993w933.getClass();
                                c0768Fx2.l = c10993w933;
                                c0768Fx2.k = 5;
                                bookmarkBridge2.q(bookmarkId, (C0768Fx2) c0508Dx2.j());
                                i3++;
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    i = 0;
                } else {
                    ArrayList arrayList = new ArrayList(hashMap.values());
                    i = arrayList.size() + 0;
                    ((C3063Xo3) interfaceC0984Ho3).f(arrayList, new C2327Rx2());
                }
                if (i3 > 0 && i > 0) {
                    i2 = 3;
                } else if (i3 > 0) {
                    i2 = 1;
                } else if (i <= 0) {
                    i2 = 0;
                }
                EI2.h(i2, 3, "Commerce.PowerBookmarks.SubscriptionValidationResult");
            }
        });
    }
}
