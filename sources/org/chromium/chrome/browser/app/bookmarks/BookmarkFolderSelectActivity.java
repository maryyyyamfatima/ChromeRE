package org.chromium.chrome.browser.app.bookmarks;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import defpackage.AbstractActivityC4038bu3;
import defpackage.AbstractC2281Ro1;
import defpackage.C2724Uz;
import defpackage.C2854Vz;
import defpackage.C2984Wz;
import defpackage.C8938qA;
import defpackage.O83;
import defpackage.RH2;
import defpackage.VH2;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.bookmarks.BookmarkFolderSelectActivity;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkFolderSelectActivity extends AbstractActivityC4038bu3 implements AdapterView.OnItemClickListener {
    public static final /* synthetic */ int I = 0;
    public C8938qA B;
    public boolean C;
    public ArrayList D;
    public BookmarkId E;
    public C2854Vz F;
    public ListView G;
    public final C2724Uz H = new C2724Uz(this);

    public static Intent u0(Context context, boolean z, BookmarkId... bookmarkIdArr) {
        Intent intent = new Intent(context, (Class<?>) BookmarkFolderSelectActivity.class);
        intent.putExtra("BookmarkFolderSelectActivity.isCreatingFolder", z);
        ArrayList<String> arrayList = new ArrayList<>(bookmarkIdArr.length);
        for (BookmarkId bookmarkId : bookmarkIdArr) {
            arrayList.add(bookmarkId.toString());
        }
        intent.putStringArrayListExtra("BookmarkFolderSelectActivity.bookmarksToMove", arrayList);
        return intent;
    }

    @Override // defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = new C8938qA();
        ArrayList v = AbstractC2281Ro1.v(getIntent(), "BookmarkFolderSelectActivity.bookmarksToMove");
        this.D = new ArrayList(v.size());
        C8938qA c8938qA = this.B;
        if (!c8938qA.d) {
            finish();
            return;
        }
        c8938qA.b(this.H);
        Iterator it = v.iterator();
        while (it.hasNext()) {
            BookmarkId a = BookmarkId.a((String) it.next());
            if (this.B.d(a)) {
                this.D.add(a);
            }
        }
        if (this.D.isEmpty()) {
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("BookmarkFolderSelectActivity.isCreatingFolder", false);
        this.C = booleanExtra;
        if (booleanExtra) {
            this.E = this.B.i();
        } else {
            this.E = this.B.f((BookmarkId) this.D.get(0)).e;
        }
        setContentView(R.layout.0_resource_name_obfuscated_res_0x7f0e0065);
        ListView listView = (ListView) findViewById(R.id.bookmark_folder_list);
        this.G = listView;
        listView.setOnItemClickListener(this);
        C2854Vz c2854Vz = new C2854Vz(this);
        this.F = c2854Vz;
        this.G.setAdapter((ListAdapter) c2854Vz);
        m0((Toolbar) findViewById(R.id.toolbar));
        l0().n(true);
        x0();
        final View findViewById = findViewById(R.id.shadow);
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08008e);
        this.G.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: Tz
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BookmarkFolderSelectActivity bookmarkFolderSelectActivity = BookmarkFolderSelectActivity.this;
                if (bookmarkFolderSelectActivity.G.getChildCount() < 1) {
                    return;
                }
                findViewById.setVisibility(bookmarkFolderSelectActivity.G.getChildAt(0).getTop() >= dimensionPixelSize ? 8 : 0);
            }
        });
    }

    public final void x0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (RH2.b()) {
            C8938qA c8938qA = this.B;
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            arrayList.add((BookmarkId) N.MeMSCM3N(c8938qA.c, c8938qA));
            arrayList2.add(0);
        }
        C8938qA c8938qA2 = this.B;
        ArrayList arrayList3 = this.D;
        c8938qA2.getClass();
        Object obj2 = ThreadUtils.a;
        N.MEqyLeo9(c8938qA2.c, c8938qA2, arrayList, arrayList2);
        if (arrayList3 != null && arrayList3.size() != 0) {
            int i = -1;
            int i2 = 0;
            boolean z = false;
            while (i2 < arrayList.size()) {
                int intValue = ((Integer) arrayList2.get(i2)).intValue();
                if (z) {
                    if (intValue <= i) {
                        i = -1;
                        z = false;
                    } else {
                        arrayList.remove(i2);
                        arrayList2.remove(i2);
                        i2--;
                    }
                }
                if (!z && arrayList3.contains((BookmarkId) arrayList.get(i2))) {
                    arrayList.remove(i2);
                    arrayList2.remove(i2);
                    i2--;
                    i = intValue;
                    z = true;
                }
                i2++;
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList.size() + 3);
        if (!this.C) {
            arrayList4.add(new C2984Wz(null, 0, getString(R.string.0_resource_name_obfuscated_res_0x7f140294), false, 0));
        }
        C2984Wz c2984Wz = null;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            BookmarkId bookmarkId = (BookmarkId) arrayList.get(i3);
            if (this.B.n(bookmarkId)) {
                C2984Wz c2984Wz2 = new C2984Wz(bookmarkId, ((Integer) arrayList2.get(i3)).intValue(), this.B.f(bookmarkId).a, bookmarkId.equals(this.E), 1);
                arrayList4.add(c2984Wz2);
                if (!this.C && this.E.equals(bookmarkId)) {
                    c2984Wz = c2984Wz2;
                }
            }
        }
        C2854Vz c2854Vz = this.F;
        c2854Vz.h = arrayList4;
        c2854Vz.notifyDataSetChanged();
        if (c2984Wz != null) {
            this.G.smoothScrollToPosition(this.F.h.indexOf(c2984Wz));
        }
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.B.o(this.H);
        this.B.c();
        this.B = null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2984Wz c2984Wz = (C2984Wz) adapterView.getItemAtPosition(i);
        if (this.C) {
            BookmarkId bookmarkId = c2984Wz.e == 1 ? c2984Wz.a : null;
            Intent intent = new Intent();
            intent.putExtra("BookmarkFolderSelectActivity.selectedFolder", bookmarkId.toString());
            setResult(-1, intent);
            finish();
            return;
        }
        int i2 = c2984Wz.e;
        if (i2 != 0) {
            if (i2 == 1) {
                w0(c2984Wz.a);
                return;
            }
            return;
        }
        ArrayList arrayList = this.D;
        Intent intent2 = new Intent(this, (Class<?>) BookmarkAddEditFolderActivity.class);
        intent2.putExtra("BookmarkAddEditFolderActivity.isAddMode", true);
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BookmarkId) it.next()).toString());
        }
        intent2.putStringArrayListExtra("BookmarkFolderSelectActivity.bookmarksToMove", arrayList2);
        startActivityForResult(intent2, 13);
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 13 && i2 == -1) {
            w0(BookmarkId.a(intent.getStringExtra("BookmarkAddEditFolderActivity.createdBookmark")));
        }
    }

    public final void w0(BookmarkId bookmarkId) {
        ArrayList arrayList = new ArrayList();
        VH2.b(this.B, this.D, arrayList, bookmarkId);
        C8938qA c8938qA = this.B;
        ArrayList arrayList2 = this.D;
        int g = c8938qA.g(bookmarkId);
        for (int i = 0; i < arrayList2.size(); i++) {
            Object obj = ThreadUtils.a;
            N.MfKsAC2S(c8938qA.c, c8938qA, (BookmarkId) arrayList2.get(i), bookmarkId, g + i);
        }
        arrayList.addAll(this.D);
        O83.a.t("enhanced_bookmark_last_used_parent_folder", bookmarkId.toString());
        v0(arrayList);
    }

    public final void v0(ArrayList arrayList) {
        if (getCallingActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("BookmarkFolderSelectActivity.bookmarkMoveResult", ((BookmarkId) arrayList.get(0)).toString());
            setResult(-1, intent);
        }
        finish();
    }
}
