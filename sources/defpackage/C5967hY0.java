package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.download.home.view.SelectionView;
import org.chromium.components.browser_ui.widget.async_image.AsyncImageView;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5967hY0 extends AbstractC10105tb2 {
    public static final /* synthetic */ int L = 0;
    public final TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f11512J;
    public int K;

    public C5967hY0(View view) {
        super(view);
        this.I = (TextView) view.findViewById(R.id.title);
        this.f11512J = (TextView) view.findViewById(R.id.caption);
        AsyncImageView asyncImageView = this.B;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = asyncImageView.q;
        if (viewOnAttachStateChangeListenerC6281iS0.l == scaleType) {
            return;
        }
        viewOnAttachStateChangeListenerC6281iS0.l = scaleType;
        viewOnAttachStateChangeListenerC6281iS0.j = true;
        if (viewOnAttachStateChangeListenerC6281iS0.k != null) {
            viewOnAttachStateChangeListenerC6281iS0.i.invalidate();
        }
    }

    @Override // defpackage.AbstractC10105tb2, defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        super.v(propertyModel, oc1);
        KC1 kc1 = (KC1) oc1;
        this.I.setText(kc1.e.g);
        this.f11512J.setText(AbstractC7853n04.a(kc1.e));
        int intValue = HN0.a(kc1.e).intValue();
        int i = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? R.drawable.f47400_resource_name_obfuscated_res_0x7f0901f0 : R.drawable.f47390_resource_name_obfuscated_res_0x7f0901ef : R.drawable.f47410_resource_name_obfuscated_res_0x7f0901f1 : R.drawable.f49780_resource_name_obfuscated_res_0x7f0902e7 : R.drawable.f50520_resource_name_obfuscated_res_0x7f090336 : R.drawable.f47730_resource_name_obfuscated_res_0x7f090212 : R.drawable.f47630_resource_name_obfuscated_res_0x7f090208;
        int i2 = this.K;
        AsyncImageView asyncImageView = this.B;
        if (i != i2) {
            this.K = i;
            Drawable e = AbstractC8540p04.e(i, R.color.f17870_resource_name_obfuscated_res_0x7f07012b, this.a.getContext());
            boolean z = asyncImageView.q.k == asyncImageView.r && !asyncImageView.w;
            Drawable b = C9146qn.b(e);
            asyncImageView.r = b;
            ViewOnAttachStateChangeListenerC6281iS0 viewOnAttachStateChangeListenerC6281iS0 = asyncImageView.q;
            if (z) {
                viewOnAttachStateChangeListenerC6281iS0.c(b);
            }
            Drawable b2 = C9146qn.b(e);
            asyncImageView.s = b2;
            if (asyncImageView.w) {
                viewOnAttachStateChangeListenerC6281iS0.c(b2);
            }
        }
        SelectionView selectionView = this.A;
        selectionView.setVisibility(selectionView.isSelected() ? 0 : 4);
        asyncImageView.setVisibility(selectionView.isSelected() ? 4 : 0);
        y(asyncImageView.getDrawable() != null);
    }

    @Override // defpackage.AbstractC10105tb2
    public final Drawable x(OfflineItemVisuals offlineItemVisuals) {
        boolean z = (offlineItemVisuals == null || offlineItemVisuals.a == null) ? false : true;
        y(z);
        if (!z) {
            return null;
        }
        C5590gR2 c5590gR2 = new C5590gR2(this.a.getResources(), offlineItemVisuals.a);
        c5590gR2.k = true;
        c5590gR2.j = true;
        c5590gR2.g = Math.min(c5590gR2.m, c5590gR2.l) / 2;
        c5590gR2.d.setShader(c5590gR2.e);
        c5590gR2.invalidateSelf();
        return c5590gR2;
    }

    public final void y(boolean z) {
        AsyncImageView asyncImageView = this.B;
        if (z) {
            asyncImageView.setBackground(null);
            return;
        }
        if (asyncImageView.getBackground() == null) {
            View view = this.a;
            Resources resources = view.getResources();
            Drawable a = AbstractC2884Wf.a(view.getContext(), R.drawable.f51090_resource_name_obfuscated_res_0x7f090371);
            a.setLevel(resources.getInteger(R.integer.f54680_resource_name_obfuscated_res_0x7f0c0043));
            asyncImageView.setBackground(a);
        }
    }
}
