package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.bookmarks.BookmarkActionBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC12269zt0 extends AbstractC8305oK2 {
    public final Context i;
    public C1521Ls1 j;
    public ArrayList k;
    public RecyclerView l;
    public final int m;
    public final float n;
    public InterfaceC0096At0 o;
    public int p;
    public final C12157za2 q = new C12157za2();

    public abstract boolean O(d dVar);

    public abstract boolean P(d dVar);

    public abstract void Q(ArrayList arrayList);

    public AbstractC12269zt0(Context context) {
        this.i = context;
        Resources resources = context.getResources();
        this.m = AbstractC4242cX.g(AbstractC11746yN.c(context, R.dimen.f30390_resource_name_obfuscated_res_0x7f080171), resources.getInteger(R.integer.f54670_resource_name_obfuscated_res_0x7f0c0042));
        this.n = resources.getDimension(R.dimen.f34720_resource_name_obfuscated_res_0x7f0803b0);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.k.size();
    }

    public final Object N(int i) {
        return this.k.get(i);
    }

    @Override // defpackage.AbstractC8305oK2
    public final void A(RecyclerView recyclerView) {
        this.l = recyclerView;
    }

    @Override // defpackage.AbstractC8305oK2
    public final void F(RecyclerView recyclerView) {
        this.l = null;
    }

    public static void M(AbstractC12269zt0 abstractC12269zt0, boolean z) {
        Iterator it = abstractC12269zt0.q.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            BookmarkActionBar bookmarkActionBar = (BookmarkActionBar) ((InterfaceC10897vt0) c11814ya2.next());
            boolean z2 = !z;
            bookmarkActionBar.o().setGroupEnabled(R.id.selection_mode_menu_group, z2);
            View a = AR3.a(bookmarkActionBar);
            if (a != null) {
                a.setEnabled(z2);
            }
            BookmarkActionBar bookmarkActionBar2 = null;
            bookmarkActionBar.D(z ? null : bookmarkActionBar);
            if (!z) {
                bookmarkActionBar2 = bookmarkActionBar;
            }
            bookmarkActionBar.N = bookmarkActionBar2;
        }
    }
}
