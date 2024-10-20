package defpackage;

import J.N;
import android.content.res.Resources;
import com.android.chrome.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.subscriptions.CommerceSubscription;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ux2 */
/* loaded from: classes.dex */
public abstract class AbstractC2717Ux2 {
    public static C0768Fx2 c(Tab tab) {
        WebContents b;
        byte[] M0xQSXQ1;
        if (tab == null || (b = tab.b()) == null || (M0xQSXQ1 = N.M0xQSXQ1(b)) == null) {
            return null;
        }
        try {
            C0768Fx2 c0768Fx2 = C0768Fx2.o;
            int length = M0xQSXQ1.length;
            XF0 c = XF0.c();
            C0768Fx2 c0768Fx22 = new C0768Fx2();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b2 = c7931nE2.b(c0768Fx22.getClass());
                        b2.f(c0768Fx22, M0xQSXQ1, 0, length + 0, new C2254Rj(c));
                        b2.b(c0768Fx22);
                        if (c0768Fx22.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c0768Fx22);
                        return c0768Fx22;
                    } catch (IOException e) {
                        if (e.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e.getCause());
                        }
                        throw new C1127Ir1(e);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C6827k14 e2) {
                    throw e2.a();
                }
            } catch (C1127Ir1 e3) {
                if (e3.g) {
                    throw new C1127Ir1(e3);
                }
                throw e3;
            }
        } catch (C1127Ir1 e4) {
            AbstractC4851eH1.f("ShoppingDataProvider", "Failed to parse shopping data: " + e4.getMessage(), new Object[0]);
            return null;
        }
    }

    public static void d(InterfaceC0984Ho3 interfaceC0984Ho3, final BookmarkBridge bookmarkBridge, final BookmarkId bookmarkId, final boolean z, final Callback callback) {
        C0768Fx2 j;
        if (bookmarkId == null || interfaceC0984Ho3 == null || (j = bookmarkBridge.j(bookmarkId)) == null) {
            return;
        }
        int a = AbstractC1418Kx2.a(j.n);
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            return;
        }
        CommerceSubscription a2 = a(j);
        Callback callback2 = new Callback() { // from class: Qx2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                BookmarkBridge bookmarkBridge2 = BookmarkBridge.this;
                if (bookmarkBridge2.a) {
                    return;
                }
                if (num.intValue() == 0) {
                    AbstractC2717Ux2.e(bookmarkBridge2, bookmarkId, z);
                }
                callback.onResult(num);
            }
        };
        if (z) {
            ((C3063Xo3) interfaceC0984Ho3).e(a2, callback2);
        } else {
            ((C3063Xo3) interfaceC0984Ho3).g(a2, callback2);
        }
    }

    public static void f(InterfaceC0984Ho3 interfaceC0984Ho3, BookmarkBridge bookmarkBridge, BookmarkId bookmarkId, final boolean z, final ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, final Resources resources, final Callback callback) {
        final C2457Sx2 c2457Sx2 = new C2457Sx2(interfaceC0984Ho3, bookmarkBridge, bookmarkId, z, viewOnClickListenerC1069If3, resources, callback);
        d(interfaceC0984Ho3, bookmarkBridge, bookmarkId, z, new Callback() { // from class: Ox2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C12188zf3 a;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Resources resources2 = resources;
                if (intValue == 0) {
                    a = C12188zf3.a(resources2.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140884 : R.string.0_resource_name_obfuscated_res_0x7f140883), null, 1, 47);
                } else {
                    a = C12188zf3.a(resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140885), c2457Sx2, 1, 48);
                    a.d = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140886);
                    a.e = null;
                }
                a.i = false;
                viewOnClickListenerC1069If3.c(a);
                callback.onResult(num);
            }
        });
    }

    public static ArrayList b(Long l, BookmarkBridge bookmarkBridge) {
        C10993w93 c10993w93;
        ArrayList arrayList = new ArrayList();
        bookmarkBridge.getClass();
        Object obj = ThreadUtils.a;
        ArrayList arrayList2 = new ArrayList();
        N.MPef_9N2(bookmarkBridge.c, bookmarkBridge, arrayList2, 1);
        if (arrayList2.size() == 0) {
            return arrayList;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            BookmarkId bookmarkId = (BookmarkId) it.next();
            C0768Fx2 j = bookmarkBridge.j(bookmarkId);
            if (j != null) {
                int a = AbstractC1418Kx2.a(j.n);
                if (a == 0) {
                    a = 1;
                }
                if (a == 2) {
                    if (j.k == 5) {
                        c10993w93 = (C10993w93) j.l;
                    } else {
                        c10993w93 = C10993w93.r;
                    }
                    if (Long.valueOf(c10993w93.n).equals(l)) {
                        arrayList.add(bookmarkId);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void e(BookmarkBridge bookmarkBridge, BookmarkId bookmarkId, boolean z) {
        C10993w93 c10993w93;
        C0768Fx2 j = bookmarkBridge.j(bookmarkId);
        if (j != null) {
            int a = AbstractC1418Kx2.a(j.n);
            if (a == 0) {
                a = 1;
            }
            if (a != 2) {
                return;
            }
            C0508Dx2 c0508Dx2 = (C0508Dx2) C0768Fx2.o.k(j);
            if (j.k == 5) {
                c10993w93 = (C10993w93) j.l;
            } else {
                c10993w93 = C10993w93.r;
            }
            C10650v93 c10650v93 = (C10650v93) C10993w93.r.k(c10993w93);
            if (c10650v93.h) {
                c10650v93.l();
                c10650v93.h = false;
            }
            C10993w93 c10993w932 = (C10993w93) c10650v93.g;
            c10993w932.j |= 16;
            c10993w932.o = z;
            C10993w93 c10993w933 = (C10993w93) c10650v93.j();
            if (c0508Dx2.h) {
                c0508Dx2.l();
                c0508Dx2.h = false;
            }
            C0768Fx2 c0768Fx2 = (C0768Fx2) c0508Dx2.g;
            c0768Fx2.getClass();
            c10993w933.getClass();
            c0768Fx2.l = c10993w933;
            c0768Fx2.k = 5;
            bookmarkBridge.q(bookmarkId, (C0768Fx2) c0508Dx2.j());
        }
    }

    public static CommerceSubscription a(C0768Fx2 c0768Fx2) {
        C10993w93 c10993w93;
        if (c0768Fx2.k == 5) {
            c10993w93 = (C10993w93) c0768Fx2.l;
        } else {
            c10993w93 = C10993w93.r;
        }
        String c = S14.c(c10993w93.p);
        C6889kC2 c6889kC2 = c10993w93.m;
        if (c6889kC2 == null) {
            c6889kC2 = C6889kC2.m;
        }
        return new CommerceSubscription("PRICE_TRACK", S14.c(c10993w93.n), "USER_MANAGED", "PRODUCT_CLUSTER_ID", -1L, new C5278fY(c, Long.toString(c6889kC2.l), c10993w93.q));
    }
}
