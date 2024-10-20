package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8938qA extends BookmarkBridge {
    public final C12157za2 i;

    public C8938qA() {
        super(Profile.d());
        this.i = new C12157za2();
    }

    public final void r(BookmarkId... bookmarkIdArr) {
        C12188zf3 a;
        ArrayList arrayList = new ArrayList();
        Object obj = ThreadUtils.a;
        N.MBJyw2pU(this.c, this);
        boolean z = true;
        for (BookmarkId bookmarkId : bookmarkIdArr) {
            BookmarkBridge.BookmarkItem f = f(bookmarkId);
            if (f != null) {
                z &= bookmarkId.getType() == 0;
                arrayList.add(f.a);
                Object obj2 = ThreadUtils.a;
                N.MJ2llFWZ(this.c, this, bookmarkId);
            }
        }
        Object obj3 = ThreadUtils.a;
        N.MIekL1sa(this.c, this);
        Iterator it = this.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            InterfaceC8595pA interfaceC8595pA = (InterfaceC8595pA) c11814ya2.next();
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            SA sa = (SA) interfaceC8595pA;
            sa.getClass();
            int length = strArr.length;
            Context context = sa.h;
            if (length == 1) {
                a = C12188zf3.a(strArr[0], sa, 0, 1);
                a.c = context.getString(R.string.f72030_resource_name_obfuscated_res_0x7f1403ed);
            } else {
                a = C12188zf3.a(String.format(Locale.getDefault(), "%d", Integer.valueOf(strArr.length)), sa, 0, 1);
                a.c = context.getString(R.string.f89730_resource_name_obfuscated_res_0x7f140b73);
            }
            if (z) {
                a.d = context.getString(R.string.f89680_resource_name_obfuscated_res_0x7f140b6e);
                a.e = null;
            }
            a.j = 3000;
            sa.g.c(a);
        }
    }

    public final String s(BookmarkId bookmarkId) {
        BookmarkBridge.BookmarkItem f = f(bookmarkId);
        return f == null ? "" : f.a;
    }

    public final BookmarkId t() {
        if (RH2.c()) {
            return k();
        }
        return i();
    }
}
