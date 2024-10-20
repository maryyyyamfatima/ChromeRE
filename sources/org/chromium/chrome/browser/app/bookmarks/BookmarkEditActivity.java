package org.chromium.chrome.browser.app.bookmarks;

import J.N;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import defpackage.AbstractActivityC4038bu3;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC4851eH1;
import defpackage.C2204Qz;
import defpackage.C8938qA;
import defpackage.LN3;
import defpackage.ViewOnClickListenerC2334Rz;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.bookmarks.BookmarkEditActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.bookmarks.BookmarkTextInputLayout;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkEditActivity extends AbstractActivityC4038bu3 {

    /* renamed from: J */
    public static final /* synthetic */ int f11519J = 0;
    public C8938qA B;
    public BookmarkId C;
    public BookmarkTextInputLayout D;
    public BookmarkTextInputLayout E;
    public TextView F;
    public boolean G;
    public MenuItem H;
    public final C2204Qz I = new C2204Qz(this);

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = new C8938qA();
        this.C = BookmarkId.a(getIntent().getStringExtra("BookmarkEditActivity.BookmarkId"));
        this.B.b(this.I);
        BookmarkBridge.BookmarkItem f = this.B.f(this.C);
        if (!this.B.d(this.C) || f == null) {
            finish();
            return;
        }
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e0063);
        this.D = (BookmarkTextInputLayout) findViewById(R.id.title_text);
        this.F = (TextView) findViewById(R.id.folder_text);
        this.E = (BookmarkTextInputLayout) findViewById(R.id.url_text);
        this.F.setOnClickListener(new ViewOnClickListenerC2334Rz(this));
        m0((Toolbar) findViewById(R.id.toolbar));
        l0().n(true);
        u0(false);
        final View findViewById = findViewById(R.id.shadow);
        final View findViewById2 = findViewById(R.id.scroll_view);
        findViewById2.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: Pz
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i = BookmarkEditActivity.f11519J;
                findViewById.setVisibility(findViewById2.getScrollY() > 0 ? 0 : 8);
            }
        });
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 15 && i2 == -1) {
            this.G = false;
            this.C = BookmarkId.a(AbstractC2281Ro1.w(intent, "BookmarkFolderSelectActivity.bookmarkMoveResult"));
            u0(true);
        }
    }

    public final void u0(boolean z) {
        BookmarkBridge.BookmarkItem f = this.B.f(this.C);
        if (!z) {
            this.D.i.setText(f.a);
            this.E.i.setText(f.b.i());
        }
        this.F.setText(this.B.s(f.e));
        this.D.setEnabled(f.a());
        this.E.setEnabled(f.a() && f.c.getType() == 0);
        this.F.setEnabled(f.b());
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        this.H = menu.add(R.string.0_resource_name_obfuscated_res_0x7f140290).setIcon(LN3.b(this, R.drawable.0_resource_name_obfuscated_res_0x7f0901e2)).setShowAsActionFlags(1);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == this.H) {
            AbstractC4851eH1.d("BookmarkEdit", "Delete button pressed by user! isFinishing() == " + isFinishing(), new Object[0]);
            C8938qA c8938qA = this.B;
            BookmarkId bookmarkId = this.C;
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            N.MJ2llFWZ(c8938qA.c, c8938qA, bookmarkId);
            finish();
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        if (this.B.d(this.C)) {
            GURL gurl = this.B.f(this.C).b;
            String C = this.D.C();
            String C2 = this.E.C();
            if (!TextUtils.isEmpty(this.D.C())) {
                C8938qA c8938qA = this.B;
                BookmarkId bookmarkId = this.C;
                c8938qA.getClass();
                Object obj = ThreadUtils.a;
                N.MWvvdW1T(c8938qA.c, c8938qA, bookmarkId.getId(), bookmarkId.getType(), C);
            }
            if (!TextUtils.isEmpty(this.E.C())) {
                BookmarkBridge.BookmarkItem f = this.B.f(this.C);
                if (f.a() && f.c.getType() == 0) {
                    GURL a = AbstractC10615v34.a(C2);
                    if (a.b && !a.equals(gurl)) {
                        C8938qA c8938qA2 = this.B;
                        BookmarkId bookmarkId2 = this.C;
                        c8938qA2.getClass();
                        Object obj2 = ThreadUtils.a;
                        N.MiNuz9ZT(c8938qA2.c, c8938qA2, bookmarkId2.getId(), bookmarkId2.getType(), a);
                    }
                }
            }
        }
        super.onStop();
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        this.B.o(this.I);
        this.B.c();
        this.B = null;
        super.onDestroy();
    }
}
