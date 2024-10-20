package org.chromium.chrome.browser.bookmarks;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.JG2;
import defpackage.OA;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BookmarkTextInputLayout extends TextInputLayout {
    public final String D0;

    public BookmarkTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.s);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.D0 = context.getResources().getString(resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i.addTextChangedListener(new OA(this));
    }

    public final String C() {
        return this.i.getText().toString().trim();
    }
}
