package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cb4 */
/* loaded from: classes2.dex */
public final class C4268cb4 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        final PropertyModel propertyModel = (PropertyModel) wd2;
        Va4 va4 = (Va4) obj;
        FD2 fd2 = (FD2) obj2;
        LD2 ld2 = Ua4.a;
        if (fd2 == ld2) {
            boolean j = propertyModel.j(ld2);
            va4.getClass();
            va4.c.setVisibility(j ? 0 : 8);
            return;
        }
        LD2 ld22 = Ua4.b;
        if (fd2 == ld22) {
            boolean j2 = propertyModel.j(ld22);
            va4.getClass();
            va4.e.setVisibility(j2 ? 0 : 8);
            return;
        }
        LD2 ld23 = Ua4.c;
        if (fd2 == ld23) {
            va4.a.findViewById(R.id.try_now).setVisibility(propertyModel.j(ld23) ? 0 : 8);
            return;
        }
        LD2 ld24 = Ua4.d;
        if (fd2 == ld24) {
            va4.a.findViewById(R.id.share_button).setVisibility(propertyModel.j(ld24) ? 0 : 8);
            return;
        }
        LD2 ld25 = Ua4.e;
        if (fd2 == ld25) {
            va4.a.findViewById(R.id.close_button).setVisibility(propertyModel.j(ld25) ? 0 : 8);
            return;
        }
        LD2 ld26 = Ua4.f;
        if (fd2 == ld26) {
            va4.a.findViewById(R.id.watch_next).setVisibility(propertyModel.j(ld26) ? 0 : 8);
            return;
        }
        LD2 ld27 = Ua4.g;
        if (fd2 == ld27) {
            va4.a.findViewById(R.id.change_language).setVisibility(propertyModel.j(ld27) ? 0 : 8);
            return;
        }
        LD2 ld28 = Ua4.h;
        if (fd2 == ld28) {
            va4.a.findViewById(R.id.play_button).setVisibility(propertyModel.j(ld28) ? 0 : 8);
            return;
        }
        PD2 pd2 = Ua4.j;
        if (fd2 == pd2) {
            ((TextView) va4.a.findViewById(R.id.change_language)).setText((CharSequence) propertyModel.i(pd2));
            return;
        }
        if (fd2 == Ua4.o) {
            va4.a.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: Wa4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.o)).run();
                }
            });
            return;
        }
        if (fd2 == Ua4.n) {
            va4.a.findViewById(R.id.share_button).setOnClickListener(new View.OnClickListener() { // from class: Xa4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.n)).run();
                }
            });
            return;
        }
        if (fd2 == Ua4.k) {
            va4.a.findViewById(R.id.watch_next).setOnClickListener(new View.OnClickListener() { // from class: Ya4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.k)).run();
                }
            });
            return;
        }
        if (fd2 == Ua4.m) {
            va4.a.findViewById(R.id.try_now).setOnClickListener(new View.OnClickListener() { // from class: Za4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.m)).run();
                }
            });
            return;
        }
        if (fd2 == Ua4.l) {
            va4.a.findViewById(R.id.change_language).setOnClickListener(new View.OnClickListener() { // from class: ab4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.l)).run();
                }
            });
            return;
        }
        if (fd2 == Ua4.i) {
            va4.a.findViewById(R.id.play_button).setOnClickListener(new View.OnClickListener() { // from class: bb4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((Runnable) PropertyModel.this.i(Ua4.i)).run();
                }
            });
            return;
        }
        PD2 pd22 = Ua4.p;
        if (fd2 == pd22) {
            EnumC2707Uv2 enumC2707Uv2 = (EnumC2707Uv2) propertyModel.i(pd22);
            View view = va4.d;
            View findViewById = view.findViewById(R.id.top_half);
            View findViewById2 = view.findViewById(R.id.bottom_half);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            if (enumC2707Uv2 == EnumC2707Uv2.PAUSED) {
                layoutParams.weight = 0.5f;
                layoutParams2.weight = 0.5f;
            } else if (enumC2707Uv2 == EnumC2707Uv2.ENDED) {
                layoutParams.weight = 0.62f;
                layoutParams2.weight = 0.38f;
            }
        }
    }
}
