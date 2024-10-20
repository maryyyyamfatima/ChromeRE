package org.chromium.chrome.browser.safety_check;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.C1812Ny2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.safety_check.SafetyCheckElementPreference;
import org.chromium.components.browser_ui.settings.ChromeBasePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafetyCheckElementPreference extends ChromeBasePreference {
    public View Y;
    public ImageView Z;
    public Callback a0;

    public SafetyCheckElementPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = R.layout.f60490_resource_name_obfuscated_res_0x7f0e0253;
        this.a0 = null;
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        this.Y = c1812Ny2.v(R.id.progress);
        this.Z = (ImageView) c1812Ny2.v(R.id.status_view);
        Callback callback = this.a0;
        if (callback != null) {
            callback.onResult(null);
        }
        this.a0 = null;
    }

    public final void Y() {
        ImageView imageView = this.Z;
        if (imageView == null || this.Y == null) {
            this.a0 = new Callback() { // from class: YT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SafetyCheckElementPreference.this.Y();
                }
            };
        } else {
            imageView.setVisibility(8);
            this.Y.setVisibility(0);
        }
    }

    public final void Z(final int i) {
        ImageView imageView = this.Z;
        if (imageView == null || this.Y == null) {
            this.a0 = new Callback() { // from class: XT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SafetyCheckElementPreference.this.Z(i);
                }
            };
            return;
        }
        imageView.setImageResource(i);
        this.Y.setVisibility(8);
        this.Z.setVisibility(0);
    }

    public final void X() {
        ImageView imageView = this.Z;
        if (imageView == null || this.Y == null) {
            this.a0 = new Callback() { // from class: ZT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SafetyCheckElementPreference.this.X();
                }
            };
        } else {
            imageView.setVisibility(8);
            this.Y.setVisibility(8);
        }
    }
}
