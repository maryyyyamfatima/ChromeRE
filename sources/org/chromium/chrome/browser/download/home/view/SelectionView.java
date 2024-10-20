package org.chromium.chrome.browser.download.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.C6674jc;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SelectionView extends FrameLayout {
    public final ImageView a;
    public final ImageView g;
    public final C6674jc h;
    public boolean i;
    public boolean j;
    public boolean k;

    public SelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f58580_resource_name_obfuscated_res_0x7f0e016d, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.check);
        this.g = (ImageView) findViewById(R.id.circle);
        this.h = C6674jc.b(context, R.drawable.f47160_resource_name_obfuscated_res_0x7f0901d6);
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.i;
    }
}
