package org.chromium.chrome.browser.app.bookmarks;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import defpackage.AbstractActivityC4038bu3;
import defpackage.C1165Iz;
import defpackage.C8938qA;
import defpackage.FI2;
import defpackage.LN3;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.bookmarks.BookmarkAddEditFolderActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.bookmarks.BookmarkTextInputLayout;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkAddEditFolderActivity extends AbstractActivityC4038bu3 implements View.OnClickListener {
    public static final /* synthetic */ int L = 0;
    public boolean B;
    public BookmarkId C;
    public C8938qA D;
    public TextView E;
    public BookmarkTextInputLayout F;
    public ArrayList G;
    public MenuItem H;
    public BookmarkId I;

    /* renamed from: J */
    public MenuItem f11518J;
    public final C1165Iz K = new C1165Iz(this);

    public static void u0(Context context, BookmarkId bookmarkId) {
        FI2.a("MobileBookmarkManagerEditFolder");
        Intent intent = new Intent(context, (Class<?>) BookmarkAddEditFolderActivity.class);
        intent.putExtra("BookmarkAddEditFolderActivity.isAddMode", false);
        intent.putExtra("BookmarkAddEditFolderActivity.BookmarkId", bookmarkId.toString());
        context.startActivity(intent);
    }

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8938qA c8938qA = new C8938qA();
        this.D = c8938qA;
        c8938qA.b(this.K);
        boolean booleanExtra = getIntent().getBooleanExtra("BookmarkAddEditFolderActivity.isAddMode", false);
        this.B = booleanExtra;
        if (booleanExtra) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("BookmarkFolderSelectActivity.bookmarksToMove");
            this.G = new ArrayList(stringArrayListExtra.size());
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                this.G.add(BookmarkId.a(it.next()));
            }
        } else {
            this.I = BookmarkId.a(getIntent().getStringExtra("BookmarkAddEditFolderActivity.BookmarkId"));
        }
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e0062);
        this.E = (TextView) findViewById(R.id.parent_folder);
        this.F = (BookmarkTextInputLayout) findViewById(R.id.folder_title);
        this.E.setOnClickListener(this);
        m0((Toolbar) findViewById(R.id.toolbar));
        l0().n(true);
        if (this.B) {
            l0().q(R.string.0_resource_name_obfuscated_res_0x7f1401c6);
            v0(this.D.i());
        } else {
            l0().q(R.string.0_resource_name_obfuscated_res_0x7f140465);
            BookmarkBridge.BookmarkItem f = this.D.f(this.I);
            v0(f.e);
            EditText editText = this.F.i;
            editText.setText(f.a);
            editText.setSelection(editText.getText().length());
            this.E.setEnabled(f.b());
        }
        this.E.setText(this.D.s(this.C));
        final View findViewById = findViewById(R.id.shadow);
        final View findViewById2 = findViewById(R.id.scroll_view);
        findViewById2.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: Hz
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i = BookmarkAddEditFolderActivity.L;
                findViewById.setVisibility(findViewById2.getScrollY() > 0 ? 0 : 8);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.B) {
            startActivity(BookmarkFolderSelectActivity.u0(this, false, this.I));
            return;
        }
        ArrayList arrayList = this.G;
        BookmarkId[] bookmarkIdArr = new BookmarkId[arrayList.size()];
        arrayList.toArray(bookmarkIdArr);
        startActivityForResult(BookmarkFolderSelectActivity.u0(this, true, bookmarkIdArr), 10);
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.B) {
            this.H = menu.add(R.string.0_resource_name_obfuscated_res_0x7f14099e).setIcon(LN3.a(R.drawable.0_resource_name_obfuscated_res_0x7f0900b0, R.color.0_resource_name_obfuscated_res_0x7f07012b, this)).setShowAsActionFlags(1);
        } else {
            this.f11518J = menu.add(R.string.0_resource_name_obfuscated_res_0x7f140290).setIcon(LN3.b(this, R.drawable.0_resource_name_obfuscated_res_0x7f0901e2)).setShowAsActionFlags(1);
        }
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        if (menuItem == this.H) {
            if (TextUtils.isEmpty(this.F.C())) {
                BookmarkTextInputLayout bookmarkTextInputLayout = this.F;
                String str = bookmarkTextInputLayout.D0;
                if (str != null) {
                    if (!TextUtils.isEmpty(bookmarkTextInputLayout.C())) {
                        str = null;
                    }
                    bookmarkTextInputLayout.l(str);
                }
                this.F.requestFocus();
                return true;
            }
            C8938qA c8938qA = this.D;
            BookmarkId bookmarkId = this.C;
            String C = this.F.C();
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            BookmarkId bookmarkId2 = (BookmarkId) N.MoWzwBNR(c8938qA.c, c8938qA, bookmarkId, 0, C);
            Intent intent = new Intent();
            intent.putExtra("BookmarkAddEditFolderActivity.createdBookmark", bookmarkId2.toString());
            setResult(-1, intent);
            finish();
            return true;
        }
        if (menuItem == this.f11518J) {
            this.D.r(this.I);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        if (!this.B && this.D.d(this.I) && !TextUtils.isEmpty(this.F.C())) {
            C8938qA c8938qA = this.D;
            BookmarkId bookmarkId = this.I;
            String C = this.F.C();
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            N.MWvvdW1T(c8938qA.c, c8938qA, bookmarkId.getId(), bookmarkId.getType(), C);
        }
        super.onStop();
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10 && i2 == -1) {
            v0(BookmarkId.a(intent.getStringExtra("BookmarkFolderSelectActivity.selectedFolder")));
        }
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.D.o(this.K);
        this.D.c();
        this.D = null;
    }

    public final void v0(BookmarkId bookmarkId) {
        this.C = bookmarkId;
        this.E.setText(this.D.s(bookmarkId));
    }
}
