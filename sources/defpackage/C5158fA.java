package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.bookmarks.PowerBookmarkShoppingItemRow;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.SyncPromoView;
import org.chromium.chrome.browser.ui.signin.PersonalizedSigninPromoView;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fA */
/* loaded from: classes.dex */
public final class C5158fA extends AbstractC12269zt0 implements PA, InterfaceC1528Lt3 {
    public BookmarkId A;
    public final C3063Xo3 B;
    public final C3440aA C;
    public final ImageFetcher r;
    public final ArrayList s;
    public final ViewOnClickListenerC1069If3 t;
    public int u;
    public InterfaceC1944Oz v;
    public C10995wA w;
    public String x;
    public BookmarkId y;
    public final AbstractC1658Mt3 z;

    public C5158fA(Context context, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        super(context);
        this.s = new ArrayList();
        this.u = -1;
        this.C = new C3440aA(this);
        AbstractC1658Mt3 b = AbstractC1658Mt3.b();
        this.z = b;
        b.a(this);
        this.r = AbstractC0687Fh1.c(Profile.d().g(), AbstractC6474j01.a);
        new C8372oY();
        this.t = viewOnClickListenerC1069If3;
        if (V83.a()) {
            this.B = C8372oY.a().a;
        }
    }

    public final int T(BookmarkId bookmarkId) {
        BookmarkBridge.BookmarkItem bookmarkItem;
        for (int i = 0; i < q(); i++) {
            C5846hA c5846hA = (C5846hA) N(i);
            if (bookmarkId.equals((c5846hA == null || (bookmarkItem = c5846hA.b) == null) ? null : bookmarkItem.c)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        return ((C5846hA) N(i)).a;
    }

    public final C3784bA R(int i, RecyclerView recyclerView) {
        ViewGroup viewGroup = (ViewGroup) AbstractC9192qu3.a(recyclerView, i, recyclerView, false);
        C3784bA c3784bA = new C3784bA(viewGroup);
        AA aa = (AA) viewGroup;
        InterfaceC1944Oz interfaceC1944Oz = this.v;
        aa.getClass();
        aa.m(((C8252oA) interfaceC1944Oz).p);
        aa.H = interfaceC1944Oz;
        if (aa.f11434J) {
            ((C8252oA) interfaceC1944Oz).k.a(aa);
            C11338xA c11338xA = new C11338xA(aa);
            aa.K = c11338xA;
            aa.F.n.a(c11338xA);
        }
        return c3784bA;
    }

    @Override // defpackage.AbstractC12269zt0
    public final boolean P(d dVar) {
        BookmarkBridge.BookmarkItem bookmarkItem;
        RecyclerView recyclerView = this.l;
        View view = dVar.a;
        recyclerView.getClass();
        d L = RecyclerView.L(view);
        C5846hA c5846hA = (C5846hA) N(L != null ? L.h() : -1);
        return (c5846hA == null || (bookmarkItem = c5846hA.b) == null || !bookmarkItem.c()) ? false : true;
    }

    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        if (i == 7 && !AbstractC2464Sz.a()) {
            i = 4;
        }
        switch (i) {
            case 0:
            case 1:
                return new C10309uA(LayoutInflater.from(this.w.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01f7, (ViewGroup) recyclerView, false));
            case 2:
                this.w.getClass();
                return new C10652vA(SyncPromoView.a(9, recyclerView));
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return R(R.layout.0_resource_name_obfuscated_res_0x7f0e0064, recyclerView);
            case 4:
                return R(R.layout.0_resource_name_obfuscated_res_0x7f0e0066, recyclerView);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return new C4127cA(AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e0127, recyclerView, false));
            case 6:
                return new C4814eA((ViewGroup) AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e0069, recyclerView, false));
            case 7:
                if (AbstractC2464Sz.a()) {
                    C3784bA R = R(R.layout.0_resource_name_obfuscated_res_0x7f0e01ff, recyclerView);
                    PowerBookmarkShoppingItemRow powerBookmarkShoppingItemRow = (PowerBookmarkShoppingItemRow) R.a;
                    C8938qA c8938qA = ((C8252oA) this.v).i;
                    powerBookmarkShoppingItemRow.S = this.r;
                    powerBookmarkShoppingItemRow.T = c8938qA;
                    powerBookmarkShoppingItemRow.U = this.B;
                    powerBookmarkShoppingItemRow.b0 = this.t;
                    return R;
                }
                return R(R.layout.0_resource_name_obfuscated_res_0x7f0e0066, recyclerView);
            case 8:
            default:
                return null;
            case 9:
                return new C4471dA(AbstractC9192qu3.a(recyclerView, R.layout.0_resource_name_obfuscated_res_0x7f0e027a, recyclerView, false));
        }
    }

    @Override // defpackage.PA
    public final void onDestroy() {
        ((C8252oA) this.v).k.d(this);
        ((C8252oA) this.v).i.o(this.C);
        ((C8252oA) this.v).p.d.d(this);
        this.v = null;
        C10995wA c10995wA = this.w;
        AbstractC1658Mt3 abstractC1658Mt3 = c10995wA.m;
        if (abstractC1658Mt3 != null) {
            abstractC1658Mt3.l(c10995wA);
        }
        if (c10995wA.k != null) {
            c10995wA.h.j(c10995wA);
            c10995wA.j.e(c10995wA);
        }
        c10995wA.g.f(c10995wA);
        this.z.l(this);
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        if (this.v == null) {
            return;
        }
        this.s.clear();
        V();
    }

    public final void X(boolean z) {
        if (this.v == null) {
            return;
        }
        boolean U = U();
        int b = ((C8252oA) this.v).b();
        if (b == 1) {
            return;
        }
        if (b != 3) {
            int i = this.w.l;
            if (i == 0) {
                this.u = -1;
            } else if (i == 1) {
                this.u = 0;
            } else if (i == 2) {
                this.u = 1;
            } else if (i == 3) {
                this.u = 2;
            }
        } else {
            this.u = -1;
        }
        boolean U2 = U();
        C8648pK2 c8648pK2 = this.a;
        if (!U && U2) {
            this.k.add(0, new C5846hA(this.u, null, null));
            if (z) {
                c8648pK2.e(0, 1);
                return;
            }
            return;
        }
        if (U && U2) {
            if (z) {
                v(0);
            }
        } else {
            if (!U || U2) {
                return;
            }
            this.k.remove(0);
            if (z) {
                c8648pK2.f(0, 1);
            }
        }
    }

    public final void V() {
        ArrayList arrayList = this.s;
        C8938qA c8938qA = ((C8252oA) this.v).i;
        ArrayList arrayList2 = new ArrayList();
        c8938qA.getClass();
        Object obj = ThreadUtils.a;
        BookmarkId bookmarkId = (BookmarkId) N.MmusspW0(c8938qA.c, c8938qA);
        BookmarkId i = c8938qA.i();
        BookmarkId bookmarkId2 = (BookmarkId) N.MG_d8ZCM(c8938qA.c, c8938qA);
        ArrayList arrayList3 = new ArrayList();
        N.MOEaKJZM(c8938qA.c, c8938qA, true, false, arrayList3);
        BookmarkId k = c8938qA.k();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            BookmarkId bookmarkId3 = (BookmarkId) it.next();
            if (bookmarkId3.getType() == 2) {
                arrayList2.add(bookmarkId3);
                LU3.a(Profile.d()).notifyEvent("read_later_bottom_sheet_folder_seen");
            } else if (c8938qA.f(bookmarkId3).e.equals(k)) {
                arrayList4.add(bookmarkId3);
            }
        }
        if (c8938qA.n(i)) {
            arrayList2.add(i);
        }
        if (c8938qA.n(bookmarkId)) {
            arrayList2.add(bookmarkId);
        }
        if (c8938qA.n(bookmarkId2)) {
            arrayList2.add(bookmarkId2);
        }
        arrayList2.addAll(arrayList4);
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.AbstractC12269zt0
    public final void Q(ArrayList arrayList) {
        boolean U = U();
        int S = S();
        long[] jArr = new long[(S - (U ? 1 : 0)) + 1];
        for (int i = U ? 1 : 0; i <= S; i++) {
            jArr[i - (U ? 1 : 0)] = ((C5846hA) arrayList.get(i)).b.c.getId();
        }
        C8938qA c8938qA = ((C8252oA) this.v).i;
        BookmarkId bookmarkId = this.y;
        c8938qA.getClass();
        Object obj = ThreadUtils.a;
        N.MgC7owSN(c8938qA.c, c8938qA, bookmarkId, jArr);
        if (this.o.a()) {
            FI2.a("MobileBookmarkManagerDragReorder");
        }
    }

    public final int S() {
        int size = this.k.size() - 1;
        BookmarkBridge.BookmarkItem bookmarkItem = ((C5846hA) this.k.get(size)).b;
        return (bookmarkItem == null || !bookmarkItem.b()) ? size - 1 : size;
    }

    @Override // defpackage.AbstractC12269zt0
    public final boolean O(d dVar) {
        return P(dVar) && ((AA) dVar.a).u();
    }

    public final boolean U() {
        return this.u != -1;
    }

    public final void W(ArrayList arrayList) {
        this.A = null;
        this.k.clear();
        if (U()) {
            this.k.add(new C5846hA(this.u, null, null));
        }
        X(false);
        if (BookmarkId.c.equals(this.y)) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C0768Fx2 j = ((C8252oA) this.v).i.j((BookmarkId) arrayList.get(size));
                if (j != null) {
                    int a = AbstractC1418Kx2.a(j.n);
                    if (a == 0) {
                        a = 1;
                    }
                    if (a == 2) {
                        if (!(j.k == 5 ? (C10993w93) j.l : C10993w93.r).o) {
                        }
                    }
                }
                arrayList.remove(size);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BookmarkId bookmarkId = (BookmarkId) it.next();
            this.k.add(C5846hA.a(((C8252oA) this.v).i.f(bookmarkId), ((C8252oA) this.v).i.j(bookmarkId)));
        }
        if (this.y.getType() == 2 && ((C8252oA) this.v).b() != 3) {
            ArrayList arrayList2 = this.k;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    BookmarkBridge.BookmarkItem bookmarkItem = ((C5846hA) it2.next()).b;
                    if (bookmarkItem != null && bookmarkItem.c.getType() == 2) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != arrayList2.size()) {
                    Collections.sort(arrayList2.subList(i, arrayList2.size()), new Comparator() { // from class: SH2
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            C5846hA c5846hA = (C5846hA) obj;
                            c5846hA.b.getClass();
                            BookmarkBridge.BookmarkItem bookmarkItem2 = ((C5846hA) obj2).b;
                            BookmarkBridge.BookmarkItem bookmarkItem3 = c5846hA.b;
                            boolean z = bookmarkItem3.i;
                            return (z == bookmarkItem2.i ? bookmarkItem3.h > bookmarkItem2.h : !z) ? -1 : 1;
                        }
                    });
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        if (((C5846hA) arrayList2.get(i4)).b != null) {
                            if (((C5846hA) arrayList2.get(i4)).b.i) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                    }
                    FI2.a("Android.BookmarkPage.ReadingList.OpenReadingList");
                    EI2.e(i2, "Bookmarks.ReadingList.NumberOfReadItems");
                    EI2.e(i3, "Bookmarks.ReadingList.NumberOfUnreadItems");
                    EI2.e(i2 + i3, "Bookmarks.ReadingList.NumberOfItems");
                    Context context = this.i;
                    arrayList2.add(i, TH2.a(context, false));
                    int i5 = i + 1;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            arrayList2.add(arrayList2.size(), TH2.a(context, true));
                            break;
                        } else {
                            if (((C5846hA) arrayList2.get(i5)).b.i) {
                                arrayList2.add(i5, TH2.a(context, true));
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
        }
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ShoppingList") && this.y.equals(((C8252oA) this.v).i.k())) {
            this.k.add(new C5846hA(5, null, null));
            this.k.add(new C5846hA(9, null, null));
        }
        t();
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        this.A = null;
    }

    @Override // defpackage.PA
    public final void g(BookmarkId bookmarkId) {
        this.A = null;
        this.x = null;
        this.y = bookmarkId;
        if (this.j == null) {
            this.j = new C1521Ls1(new C11926yt0(this));
        }
        this.j.j(this.l);
        if (this.y.equals(((C8252oA) this.v).i.k())) {
            W(this.s);
        } else {
            W(((C8252oA) this.v).i.h(bookmarkId));
        }
        if (!BookmarkId.c.equals(bookmarkId)) {
            if (bookmarkId.getType() == 2) {
                LU3.a(Profile.d()).notifyEvent("read_later_bookmark_folder_opened");
                SelectableListLayout selectableListLayout = ((C8252oA) this.v).m;
                selectableListLayout.o = R.string.0_resource_name_obfuscated_res_0x7f140933;
                selectableListLayout.h.setText(R.string.0_resource_name_obfuscated_res_0x7f140933);
                return;
            }
            SelectableListLayout selectableListLayout2 = ((C8252oA) this.v).m;
            selectableListLayout2.o = R.string.0_resource_name_obfuscated_res_0x7f1402b0;
            selectableListLayout2.h.setText(R.string.0_resource_name_obfuscated_res_0x7f1402b0);
            return;
        }
        SelectableListLayout selectableListLayout3 = ((C8252oA) this.v).m;
        selectableListLayout3.o = R.string.0_resource_name_obfuscated_res_0x7f140b50;
        selectableListLayout3.h.setText(R.string.0_resource_name_obfuscated_res_0x7f140b50);
    }

    @Override // defpackage.PA
    public final void h() {
        this.A = null;
        C1521Ls1 c1521Ls1 = this.j;
        if (c1521Ls1 != null) {
            c1521Ls1.j(null);
        }
        X(false);
        int size = this.k.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((C5846hA) this.k.get(size)).a == 6) {
                    this.k.remove(size);
                }
            } else {
                t();
                return;
            }
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(final d dVar, int i) {
        BookmarkBridge.BookmarkItem bookmarkItem;
        int i2 = dVar.k;
        View view = dVar.a;
        if (i2 == 0 || i2 == 1) {
            PersonalizedSigninPromoView personalizedSigninPromoView = (PersonalizedSigninPromoView) view.findViewById(R.id.signin_promo_view_container);
            final C10995wA c10995wA = this.w;
            c10995wA.getClass();
            c10995wA.k.g(c10995wA.j, personalizedSigninPromoView, new InterfaceC12164zb3() { // from class: sA
                @Override // defpackage.InterfaceC12164zb3
                public final void onDismiss() {
                    C10995wA c10995wA2 = C10995wA.this;
                    c10995wA2.l = c10995wA2.a();
                    c10995wA2.c();
                }
            });
            return;
        }
        if (i2 == 6) {
            C5846hA c5846hA = (C5846hA) N(i);
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.description);
            textView.setText(c5846hA.c.a);
            C5502gA c5502gA = c5846hA.c;
            textView2.setText(c5502gA.b);
            textView2.setVisibility(TextUtils.isEmpty(c5502gA.b) ? 8 : 0);
            int i3 = c5502gA.c;
            if (i3 > 0) {
                textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        if (!(i2 == 4 || i2 == 3 || i2 == 7)) {
            if (i2 == 9) {
                LinearLayout linearLayout = (LinearLayout) view;
                linearLayout.setClickable(true);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Yz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ((C8252oA) C5158fA.this.v).g(BookmarkId.c);
                    }
                });
                return;
            }
            return;
        }
        AA aa = (AA) view;
        C5846hA c5846hA2 = (C5846hA) N(i);
        BookmarkId bookmarkId = (c5846hA2 == null || (bookmarkItem = c5846hA2.b) == null) ? null : bookmarkItem.c;
        if (i == U() && i == S()) {
            r4 = 3;
        } else if (i != U()) {
            r4 = i == S() ? 2 : 1;
        }
        aa.v(bookmarkId, r4, BookmarkId.c.equals(this.y));
        aa.G.setOnTouchListener(new View.OnTouchListener() { // from class: Xz
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C5158fA c5158fA = C5158fA.this;
                c5158fA.getClass();
                if (motionEvent.getActionMasked() != 0) {
                    return true;
                }
                c5158fA.j.u(dVar);
                return true;
            }
        });
        if (bookmarkId.equals(this.A)) {
            Yc4 yc4 = new Yc4(2);
            yc4.c = 1;
            AbstractC3593ad4.b(view, yc4);
            this.A = null;
            return;
        }
        AbstractC3593ad4.a(view);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void I(d dVar) {
        C0009Ab3 c0009Ab3;
        ViewTreeObserverOnPreDrawListenerC2771Vi1 viewTreeObserverOnPreDrawListenerC2771Vi1;
        int i = dVar.k;
        if ((i != 0 && i != 1) || (c0009Ab3 = this.w.k) == null || (viewTreeObserverOnPreDrawListenerC2771Vi1 = c0009Ab3.b) == null) {
            return;
        }
        viewTreeObserverOnPreDrawListenerC2771Vi1.a(null);
        c0009Ab3.b = null;
    }
}
