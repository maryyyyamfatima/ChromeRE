package org.chromium.chrome.browser.bookmarks;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.android.chrome.R;
import defpackage.AA;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC4855eI0;
import defpackage.C6964kR2;
import defpackage.C8252oA;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkItemRow extends AA implements LargeIconBridge.LargeIconCallback {
    public GURL N;
    public final C6964kR2 O;
    public final int P;
    public final int Q;
    public boolean R;

    public BookmarkItemRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (this.C) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f28540_resource_name_obfuscated_res_0x7f080092);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f30470_resource_name_obfuscated_res_0x7f080179);
        }
        this.P = dimensionPixelSize;
        if (this.C) {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f28550_resource_name_obfuscated_res_0x7f080093);
        } else {
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
        }
        int i = dimensionPixelSize2;
        this.Q = i;
        if (this.C) {
            this.O = new C6964kR2(i, i, i / 2, getContext().getColor(R.color.f17660_resource_name_obfuscated_res_0x7f07010e), getResources().getDimensionPixelSize(R.dimen.f28530_resource_name_obfuscated_res_0x7f080091));
        } else {
            this.O = AbstractC4855eI0.a(context);
        }
    }

    @Override // defpackage.U23
    public final void j() {
        if (((C8252oA) this.H).b() != 1) {
        }
        ((C8252oA) this.H).f(this.I);
    }

    @Override // defpackage.AA
    public BookmarkBridge.BookmarkItem v(BookmarkId bookmarkId, int i, boolean z) {
        BookmarkBridge.BookmarkItem v = super.v(bookmarkId, i, z);
        GURL gurl = v.b;
        this.N = gurl;
        this.s.setImageDrawable(null);
        this.v.setText(v.a);
        this.w.setText(AbstractC10615v34.b(1, gurl));
        this.R = false;
        ((C8252oA) this.H).r.b(this.N, this.P, this);
        return v;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        if (this.R) {
            return;
        }
        s(AbstractC4855eI0.e(bitmap, this.N, i, this.O, getResources(), this.Q));
    }
}
