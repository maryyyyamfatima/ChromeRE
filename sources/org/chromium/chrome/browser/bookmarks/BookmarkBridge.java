package org.chromium.chrome.browser.bookmarks;

import J.N;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC1218Jj2;
import defpackage.AbstractC1684Mz;
import defpackage.C0768Fx2;
import defpackage.C0958Hj2;
import defpackage.C1038Hz2;
import defpackage.C1088Ij2;
import defpackage.C1127Ir1;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C1295Jz;
import defpackage.C1425Kz;
import defpackage.C1814Nz;
import defpackage.C2254Rj;
import defpackage.C3063Xo3;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.C8372oY;
import defpackage.FI2;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.RH2;
import defpackage.V60;
import defpackage.V83;
import defpackage.XF0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkBridge {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public final C12157za2 f = new C12157za2();
    public final C3063Xo3 g;
    public final C1295Jz h;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface BookmarksCallback {
        void onBookmarksAvailable(BookmarkId bookmarkId, List list);

        void onBookmarksFolderHierarchyAvailable(BookmarkId bookmarkId, List list);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface PriceUpdateCallback {
        void a(BookmarkId bookmarkId, GURL gurl, C1038Hz2 c1038Hz2);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class BookmarkItem {
        public final String a;
        public final GURL b;
        public final BookmarkId c;
        public final boolean d;
        public final BookmarkId e;
        public final boolean f;
        public final boolean g;
        public final long h;
        public final boolean i;

        public final boolean b() {
            return (RH2.b() && this.c.getType() == 2) || c();
        }

        public BookmarkItem(BookmarkId bookmarkId, String str, GURL gurl, boolean z, BookmarkId bookmarkId2, boolean z2, boolean z3, long j, boolean z4) {
            this.c = bookmarkId;
            this.a = str;
            this.b = gurl;
            this.d = z;
            this.e = bookmarkId2;
            this.f = z2;
            this.g = z3;
            this.h = j;
            this.i = z4;
        }

        public final boolean a() {
            return this.f;
        }

        public final boolean c() {
            return a() && this.c.getType() == 0;
        }
    }

    public BookmarkBridge(Profile profile) {
        Object obj = ThreadUtils.a;
        long MTRUIEfD = N.MTRUIEfD(this, profile);
        this.c = MTRUIEfD;
        this.b = N.MHTPaGlQ(MTRUIEfD, this);
        C1295Jz c1295Jz = new C1295Jz(this);
        this.h = c1295Jz;
        if (V83.a()) {
            new C8372oY();
            C3063Xo3 c3063Xo3 = C8372oY.a().a;
            this.g = c3063Xo3;
            c3063Xo3.e.a(c1295Jz);
        }
    }

    public final void c() {
        this.a = true;
        long j = this.c;
        if (j != 0) {
            N.M$aEU5TZ(j, this);
            this.c = 0L;
            this.d = false;
            this.e.clear();
        }
        this.f.clear();
        C3063Xo3 c3063Xo3 = this.g;
        if (c3063Xo3 != null) {
            c3063Xo3.e.d(this.h);
        }
    }

    public final BookmarkId l(Tab tab) {
        Object obj = ThreadUtils.a;
        if (tab == null || tab.l()) {
            return null;
        }
        long j = this.c;
        if (j == 0) {
            return null;
        }
        return (BookmarkId) N.MUjtS5c8(j, this, tab.b(), true);
    }

    public final void b(AbstractC1684Mz abstractC1684Mz) {
        this.f.a(abstractC1684Mz);
    }

    public final void o(AbstractC1684Mz abstractC1684Mz) {
        this.f.d(abstractC1684Mz);
    }

    public final void e(Runnable runnable) {
        if (this.d) {
            runnable.run();
            return;
        }
        b(new C1425Kz(this, SystemClock.elapsedRealtime(), runnable));
        Context context = V60.a;
        if (AbstractC1218Jj2.a) {
            return;
        }
        boolean z = true;
        AbstractC1218Jj2.a = true;
        C1088Ij2 c1088Ij2 = new C1088Ij2(context, PartnerBrowserCustomizations.b());
        if ((context.getApplicationInfo().flags & 1) == 1) {
            if (c1088Ij2.b == 0) {
                return;
            }
            new C0958Hj2(c1088Ij2).c(AbstractC0185Bl.e);
            return;
        }
        c1088Ij2.h = true;
        if (c1088Ij2.i) {
            N.MZy4XMIu(c1088Ij2.b, c1088Ij2);
        }
        synchronized (c1088Ij2.d) {
            if (c1088Ij2.e != 0 || !c1088Ij2.h || !c1088Ij2.i) {
                z = false;
            }
            if (z) {
                c1088Ij2.a();
            }
        }
    }

    public final BookmarkItem f(BookmarkId bookmarkId) {
        Object obj = ThreadUtils.a;
        if (bookmarkId == null) {
            return null;
        }
        if (!BookmarkId.c.equals(bookmarkId)) {
            return (BookmarkItem) N.M4Ir5snM(this.c, this, bookmarkId.getId(), bookmarkId.getType());
        }
        return new BookmarkItem(bookmarkId, null, null, true, k(), false, false, 0L, false);
    }

    public final BookmarkId k() {
        Object obj = ThreadUtils.a;
        return (BookmarkId) N.MTVYsNWF(this.c, this);
    }

    public final BookmarkId i() {
        Object obj = ThreadUtils.a;
        return (BookmarkId) N.M7yxRJ0Q(this.c, this);
    }

    public final int g(BookmarkId bookmarkId) {
        Object obj = ThreadUtils.a;
        return N.MywxQQ$n(this.c, this, bookmarkId.getId(), bookmarkId.getType());
    }

    public final ArrayList h(BookmarkId bookmarkId) {
        Object obj = ThreadUtils.a;
        if (BookmarkId.c.equals(bookmarkId)) {
            return p("", 2, -1);
        }
        ArrayList arrayList = new ArrayList();
        N.MjHaBU2n(this.c, this, bookmarkId.getId(), bookmarkId.getType(), arrayList);
        return arrayList;
    }

    public final ArrayList p(String str, int i, int i2) {
        int i3;
        Object obj = ThreadUtils.a;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            i3 = -1;
        } else {
            if (i == 0) {
                throw null;
            }
            i3 = i - 1;
        }
        N.MUcwMevE(this.c, this, arrayList, str, null, i3, i2);
        return arrayList;
    }

    public final C0768Fx2 j(BookmarkId bookmarkId) {
        byte[] Mk0Xl$Jx;
        if (bookmarkId != null) {
            long j = this.c;
            if (j == 0 || (Mk0Xl$Jx = N.Mk0Xl$Jx(j, this, bookmarkId.getId(), bookmarkId.getType())) == null) {
                return null;
            }
            try {
                C0768Fx2 c0768Fx2 = C0768Fx2.o;
                int length = Mk0Xl$Jx.length;
                XF0 c = XF0.c();
                C0768Fx2 c0768Fx22 = new C0768Fx2();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c0768Fx22.getClass());
                        b.f(c0768Fx22, Mk0Xl$Jx, 0, length + 0, new C2254Rj(c));
                        b.b(c0768Fx22);
                        if (c0768Fx22.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c0768Fx22);
                        return c0768Fx22;
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 unused2) {
                N.MzomnHrD(this.c, this, bookmarkId.getId(), bookmarkId.getType());
            }
        }
        return null;
    }

    public final void q(BookmarkId bookmarkId, C0768Fx2 c0768Fx2) {
        if (c0768Fx2 == null) {
            return;
        }
        N.MXLaptH_(this.c, this, bookmarkId.getId(), bookmarkId.getType(), c0768Fx2.toByteArray());
    }

    public final boolean d(BookmarkId bookmarkId) {
        Object obj = ThreadUtils.a;
        return N.MhzzenO8(this.c, this, bookmarkId.getId(), bookmarkId.getType());
    }

    public final boolean n(BookmarkId bookmarkId) {
        Object obj = ThreadUtils.a;
        if (RH2.b() && bookmarkId.getType() == 2) {
            return true;
        }
        return N.MCNIYDWB(this.c, this, bookmarkId.getId(), bookmarkId.getType());
    }

    public final BookmarkId a(WebContents webContents, BookmarkId bookmarkId, int i, String str, GURL gurl) {
        Object obj = ThreadUtils.a;
        FI2.a("BookmarkAdded");
        if (TextUtils.isEmpty(str)) {
            str = gurl.i();
        }
        return (BookmarkId) N.Mg53Jgou(this.c, this, webContents, bookmarkId, i, str, gurl);
    }

    public final boolean m() {
        Object obj = ThreadUtils.a;
        long j = this.c;
        if (j == 0) {
            return false;
        }
        return N.M9xtlU8J(j);
    }

    public final void bookmarkModelLoaded() {
        this.d = true;
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).d();
            }
        }
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C1814Nz c1814Nz = (C1814Nz) arrayList.get(i);
            BookmarkBridge bookmarkBridge = c1814Nz.d;
            int i2 = c1814Nz.c;
            if (i2 == 0) {
                BookmarkId bookmarkId = c1814Nz.b;
                BookmarksCallback bookmarksCallback = c1814Nz.a;
                bookmarkBridge.getClass();
                Object obj = ThreadUtils.a;
                if (bookmarkBridge.d) {
                    N.M4_aKMtg(bookmarkBridge.c, bookmarkBridge, bookmarkId, bookmarksCallback, new ArrayList());
                } else {
                    bookmarkBridge.e.add(new C1814Nz(bookmarkId, bookmarksCallback, 0, bookmarkBridge));
                }
            } else if (i2 == 1) {
                BookmarkId bookmarkId2 = c1814Nz.b;
                BookmarksCallback bookmarksCallback2 = c1814Nz.a;
                bookmarkBridge.getClass();
                Object obj2 = ThreadUtils.a;
                if (bookmarkBridge.d) {
                    N.MbzcH$4D(bookmarkBridge.c, bookmarkBridge, bookmarkId2, bookmarksCallback2, new ArrayList());
                } else {
                    bookmarkBridge.e.add(new C1814Nz(bookmarkId2, bookmarksCallback2, 1, bookmarkBridge));
                }
            }
        }
        arrayList.clear();
    }

    public final void destroyFromNative() {
        c();
    }

    public final void bookmarkNodeMoved(BookmarkItem bookmarkItem, int i, BookmarkItem bookmarkItem2, int i2) {
        if (this.b) {
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).h(bookmarkItem, bookmarkItem2, i2);
            }
        }
    }

    public final void bookmarkNodeAdded(BookmarkItem bookmarkItem, int i) {
        if (this.b) {
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).e();
            }
        }
    }

    public final void bookmarkNodeRemoved(BookmarkItem bookmarkItem, int i, BookmarkItem bookmarkItem2) {
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).i(bookmarkItem, bookmarkItem2, this.b);
            }
        }
    }

    public final void bookmarkAllUserNodesRemoved() {
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).c();
            }
        }
    }

    public final void bookmarkNodeChanged(BookmarkItem bookmarkItem) {
        if (this.b) {
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).f(bookmarkItem);
            }
        }
    }

    public final void bookmarkNodeChildrenReordered(BookmarkItem bookmarkItem) {
        if (this.b) {
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).g();
            }
        }
    }

    public final void extensiveBookmarkChangesBeginning() {
        this.b = true;
    }

    public final void extensiveBookmarkChangesEnded() {
        this.b = false;
        bookmarkModelChanged();
    }

    public final void bookmarkModelChanged() {
        if (this.b) {
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).c();
            }
        }
    }

    public final void editBookmarksEnabledChanged() {
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((AbstractC1684Mz) c11814ya2.next()).c();
            }
        }
    }

    public static BookmarkItem createBookmarkItem(long j, int i, String str, GURL gurl, boolean z, long j2, int i2, boolean z2, boolean z3, long j3, boolean z4) {
        return new BookmarkItem(new BookmarkId(i, j), str, gurl, z, new BookmarkId(i2, j2), z2, z3, j3, z4);
    }

    public static void addToList(List list, BookmarkItem bookmarkItem) {
        list.add(bookmarkItem);
    }

    public static void addToBookmarkIdList(List list, long j, int i) {
        list.add(new BookmarkId(i, j));
    }

    public static void addToBookmarkIdListWithDepth(List list, long j, int i, List list2, int i2) {
        list.add(new BookmarkId(i, j));
        list2.add(Integer.valueOf(i2));
    }

    public final void onProductPriceUpdated(GURL gurl, byte[] bArr, PriceUpdateCallback priceUpdateCallback) {
        try {
            C1038Hz2 c1038Hz2 = C1038Hz2.m;
            int length = bArr.length;
            XF0 c = XF0.c();
            C1038Hz2 c1038Hz22 = new C1038Hz2();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c1038Hz22.getClass());
                        b.f(c1038Hz22, bArr, 0, length + 0, new C2254Rj(c));
                        b.b(c1038Hz22);
                        if (c1038Hz22.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c1038Hz22);
                        priceUpdateCallback.a(null, gurl, c1038Hz22);
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C6827k14 e2) {
                    throw e2.a();
                }
            } catch (IOException e3) {
                if (e3.getCause() instanceof C1127Ir1) {
                    throw ((C1127Ir1) e3.getCause());
                }
                throw new C1127Ir1(e3);
            }
        } catch (C1127Ir1 unused2) {
        }
    }
}
