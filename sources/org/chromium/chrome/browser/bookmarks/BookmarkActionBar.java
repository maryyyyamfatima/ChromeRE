package org.chromium.chrome.browser.bookmarks;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import com.android.chrome.R;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.BO3;
import defpackage.C11598xv3;
import defpackage.C6876kA;
import defpackage.C8252oA;
import defpackage.C8938qA;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.InterfaceC10897vt0;
import defpackage.InterfaceC1944Oz;
import defpackage.PA;
import defpackage.QA;
import defpackage.WA;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.bookmarks.BookmarkActivity;
import org.chromium.chrome.browser.app.bookmarks.BookmarkAddEditFolderActivity;
import org.chromium.chrome.browser.app.bookmarks.BookmarkFolderSelectActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkActionBar extends AbstractViewOnClickListenerC4089c33 implements PA, BO3, InterfaceC10897vt0 {
    public BookmarkBridge.BookmarkItem B0;
    public InterfaceC1944Oz C0;

    @Override // defpackage.PA
    public final void h() {
    }

    public BookmarkActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(this);
        s(R.menu.0_resource_name_obfuscated_res_0x7f100000);
        this.N = this;
        o().findItem(R.id.selection_mode_edit_menu_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f140464);
        o().findItem(R.id.selection_mode_move_menu_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f140292);
        o().findItem(R.id.selection_mode_delete_menu_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f140290);
        o().findItem(R.id.selection_open_in_incognito_tab_id).setTitle(R.string.0_resource_name_obfuscated_res_0x7f1403aa);
        o().setGroupEnabled(R.id.selection_mode_menu_group, false);
    }

    @Override // defpackage.BO3
    public final boolean onMenuItemClick(MenuItem menuItem) {
        r();
        if (menuItem.getItemId() == R.id.edit_menu_id) {
            BookmarkAddEditFolderActivity.u0(getContext(), this.B0.c);
            return true;
        }
        if (menuItem.getItemId() == R.id.close_menu_id) {
            Context context = getContext();
            if (context instanceof BookmarkActivity) {
                ((Activity) context).finish();
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.search_menu_id) {
            C8252oA c8252oA = (C8252oA) this.C0;
            c8252oA.getClass();
            QA qa = new QA();
            qa.a = 3;
            qa.b = "";
            c8252oA.h(qa);
            SelectableListLayout selectableListLayout = c8252oA.m;
            selectableListLayout.l(selectableListLayout.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f14029e));
            c8252oA.o.P();
            return true;
        }
        C6876kA c6876kA = ((C8252oA) this.C0).p;
        if (menuItem.getItemId() == R.id.selection_mode_edit_menu_id) {
            BookmarkBridge.BookmarkItem f = ((C8252oA) this.C0).i.f((BookmarkId) c6876kA.c().get(0));
            boolean z = f.d;
            BookmarkId bookmarkId = f.c;
            if (z) {
                BookmarkAddEditFolderActivity.u0(getContext(), bookmarkId);
            } else {
                WA.h(getContext(), bookmarkId);
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_mode_move_menu_id) {
            ArrayList c = c6876kA.c();
            if (c.size() >= 1) {
                Context context2 = getContext();
                context2.startActivity(BookmarkFolderSelectActivity.u0(context2, false, (BookmarkId[]) c.toArray(new BookmarkId[c.size()])));
                FI2.a("MobileBookmarkManagerMoveToFolderBulk");
            }
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_mode_delete_menu_id) {
            ((C8252oA) this.C0).i.r((BookmarkId[]) c6876kA.c.toArray(new BookmarkId[0]));
            FI2.a("MobileBookmarkManagerDeleteBulk");
            return true;
        }
        if (menuItem.getItemId() == R.id.selection_open_in_new_tab_id) {
            FI2.a("MobileBookmarkManagerEntryOpenedInNewTab");
            EI2.c(this.a0.c.size(), "Bookmarks.Count.OpenInNewTab");
            V(c6876kA.c(), new C11598xv3(false), ((C8252oA) this.C0).i);
            c6876kA.b();
            return true;
        }
        if (menuItem.getItemId() != R.id.selection_open_in_incognito_tab_id) {
            return false;
        }
        FI2.a("MobileBookmarkManagerEntryOpenedInIncognito");
        EI2.c(this.a0.c.size(), "Bookmarks.Count.OpenInIncognito");
        V(c6876kA.c(), new C11598xv3(true), ((C8252oA) this.C0).i);
        c6876kA.b();
        return true;
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void O() {
        super.O();
        if (this.C0 == null) {
            o().findItem(R.id.search_menu_id).setVisible(false);
            o().findItem(R.id.edit_menu_id).setVisible(false);
        }
    }

    @Override // defpackage.PA
    public final void onDestroy() {
        InterfaceC1944Oz interfaceC1944Oz = this.C0;
        if (interfaceC1944Oz == null) {
            return;
        }
        ((C8252oA) interfaceC1944Oz).k.d(this);
    }

    @Override // defpackage.PA
    public final void g(BookmarkId bookmarkId) {
        this.B0 = ((C8252oA) this.C0).i.f(bookmarkId);
        o().findItem(R.id.search_menu_id).setVisible(true);
        o().findItem(R.id.edit_menu_id).setVisible(this.B0.a());
        if (bookmarkId.equals(((C8252oA) this.C0).i.k())) {
            F(R.string.0_resource_name_obfuscated_res_0x7f1402af);
            M(0);
            return;
        }
        if (bookmarkId.equals(BookmarkId.c)) {
            F(R.string.0_resource_name_obfuscated_res_0x7f140882);
        } else {
            C8938qA c8938qA = ((C8252oA) this.C0).i;
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            ArrayList arrayList = new ArrayList();
            N.MHq3fk0e(c8938qA.c, c8938qA, arrayList);
            if (arrayList.contains(this.B0.e) && TextUtils.isEmpty(this.B0.a)) {
                F(R.string.0_resource_name_obfuscated_res_0x7f1402af);
            } else {
                G(this.B0.a);
            }
        }
        M(1);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        super.d(arrayList);
        InterfaceC1944Oz interfaceC1944Oz = this.C0;
        if (interfaceC1944Oz == null) {
            return;
        }
        if (this.W) {
            o().findItem(R.id.selection_mode_edit_menu_id).setVisible(arrayList.size() == 1);
            o().findItem(R.id.selection_open_in_incognito_tab_id).setVisible(N.M$3vpOHw());
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BookmarkBridge.BookmarkItem f = ((C8252oA) this.C0).i.f((BookmarkId) it.next());
                if (f != null && f.d) {
                    o().findItem(R.id.selection_open_in_new_tab_id).setVisible(false);
                    o().findItem(R.id.selection_open_in_incognito_tab_id).setVisible(false);
                    break;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((BookmarkId) it2.next()).getType() == 1) {
                    o().findItem(R.id.selection_mode_move_menu_id).setVisible(false);
                    break;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((BookmarkId) it3.next()).getType() == 2) {
                    o().findItem(R.id.selection_mode_move_menu_id).setVisible(false);
                    o().findItem(R.id.selection_mode_edit_menu_id).setVisible(false);
                    return;
                }
            }
            return;
        }
        ((C8252oA) interfaceC1944Oz).c(this);
    }

    public static void V(ArrayList arrayList, C11598xv3 c11598xv3, C8938qA c8938qA) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BookmarkId bookmarkId = (BookmarkId) it.next();
            if (bookmarkId != null) {
                GURL gurl = c8938qA.f(bookmarkId).b;
                c11598xv3.b(5, null, new LoadUrlParams(gurl));
                if (bookmarkId.getType() == 2) {
                    N.Mj0PtWvo(c8938qA.c, c8938qA, gurl, true);
                }
            }
        }
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33
    public final void L() {
        if (this.b0) {
            super.L();
            return;
        }
        ((C8252oA) this.C0).g(this.B0.e);
    }
}
