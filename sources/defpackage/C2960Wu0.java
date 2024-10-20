package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.chrome.elements.video.ui.VideoFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wu0 */
/* loaded from: classes.dex */
public final class C2960Wu0 implements InterfaceC2700Uu0, InterfaceC11130wa4 {
    public static final Uri h = Uri.parse("https://www.gstatic.com/discover/images/play_button_48_48.png");
    public VideoFrameLayout a;
    public ImageView b;
    public View c;
    public TextView d;
    public Ks4 e;
    public String f = "";
    public final C2830Vu0 g = new C2830Vu0();

    public C2960Wu0(ViewGroup viewGroup) {
    }

    @Override // defpackage.InterfaceC11130wa4
    public final void a(EnumC10787va4 enumC10787va4) {
        b(enumC10787va4);
    }

    public final void b(EnumC10787va4 enumC10787va4) {
        Drawable[] compoundDrawablesRelative;
        int ordinal = enumC10787va4.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ImageView imageView = this.b;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                View view = this.c;
                if (view != null) {
                    view.setVisibility(0);
                }
                TextView textView = this.d;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            if (ordinal == 2 || ordinal == 3) {
                ImageView imageView2 = this.b;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                View view2 = this.c;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setVisibility(AbstractC2442Su2.a(this.f) ? 8 : 0);
                    return;
                }
                return;
            }
            if (ordinal != 4) {
                return;
            }
        }
        ImageView imageView3 = this.b;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        View view3 = this.c;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            if (textView3.length() > 0 || ((compoundDrawablesRelative = textView3.getCompoundDrawablesRelative()) != null && compoundDrawablesRelative.length > 2 && compoundDrawablesRelative[2] != null)) {
                z = false;
            }
            textView3.setVisibility(z ? 8 : 0);
        }
    }
}
