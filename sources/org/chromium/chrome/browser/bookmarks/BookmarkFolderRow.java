package org.chromium.chrome.browser.bookmarks;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AA;
import defpackage.C8252oA;
import defpackage.C8938qA;
import defpackage.WA;
import defpackage.Y50;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkFolderRow extends AA {
    public BookmarkFolderRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AA, defpackage.S23, defpackage.U23, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        s(WA.c(getContext(), 0));
    }

    @Override // defpackage.U23
    public final void j() {
        ((C8252oA) this.H).g(this.I);
    }

    @Override // defpackage.AA
    public final BookmarkBridge.BookmarkItem v(BookmarkId bookmarkId, int i, boolean z) {
        String string;
        String string2;
        BookmarkBridge.BookmarkItem v = super.v(bookmarkId, i, z);
        this.v.setText(v.a);
        BookmarkId bookmarkId2 = v.c;
        if (bookmarkId2.getType() == 2) {
            C8938qA c8938qA = ((C8252oA) this.H).i;
            Iterator it = c8938qA.h(bookmarkId).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (!c8938qA.f((BookmarkId) it.next()).i) {
                    i2++;
                }
            }
            TextView textView = this.w;
            if (i2 > 0) {
                string2 = getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120030, i2, Integer.valueOf(i2));
            } else {
                string2 = getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140936);
            }
            textView.setText(string2);
        } else {
            C8938qA c8938qA2 = ((C8252oA) this.H).i;
            c8938qA2.getClass();
            Object obj = ThreadUtils.a;
            int M9Wq4IA6 = N.M9Wq4IA6(c8938qA2.c, c8938qA2, bookmarkId.getId(), bookmarkId.getType());
            TextView textView2 = this.w;
            if (M9Wq4IA6 > 0) {
                string = getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12000d, M9Wq4IA6, Integer.valueOf(M9Wq4IA6));
            } else {
                string = getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406d1);
            }
            textView2.setText(string);
        }
        s(WA.c(getContext(), bookmarkId2.getType()));
        return v;
    }

    @Override // defpackage.S23
    public final ColorStateList p() {
        BookmarkId bookmarkId = this.I;
        return Y50.b(getContext(), (bookmarkId == null ? 0 : bookmarkId.getType()) == 2 ? R.color.0_resource_name_obfuscated_res_0x7f070113 : R.color.0_resource_name_obfuscated_res_0x7f07012b);
    }
}
