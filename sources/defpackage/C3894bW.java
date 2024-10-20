package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bW */
/* loaded from: classes.dex */
public final class C3894bW implements InterfaceC9641sD2 {
    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 444964488;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        YV yv = new YV();
        yv.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return yv;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        YV yv = (YV) obj;
        int b = yv.b(4);
        if ((b != 0 ? yv.b.getInt(b + yv.a) : 0) != 1) {
            int b2 = yv.b(4);
            if ((b2 != 0 ? yv.b.getInt(b2 + yv.a) : 0) == 2) {
                interfaceC8177nx0.e(new InterfaceC6801jx0() { // from class: aW
                    @Override // defpackage.InterfaceC6801jx0
                    public final boolean a(View view, C1629Mo c1629Mo) {
                        C3894bW.f(view);
                        return true;
                    }
                });
                return;
            }
            return;
        }
        interfaceC8177nx0.a(new InterfaceC7489lx0() { // from class: ZV
            @Override // defpackage.InterfaceC7489lx0
            public final void a(View view, C1629Mo c1629Mo) {
                C3894bW.f(view);
            }
        });
    }

    public static void f(View view) {
        RecyclerView recyclerView;
        if (view != null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    recyclerView = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
            if (recyclerView != null) {
                Object tag = recyclerView.getTag(R.id.elements_item_touch_helper);
                if (tag instanceof C1521Ls1) {
                    View C = recyclerView.C(view);
                    d K = C != null ? recyclerView.K(C) : null;
                    if (K != null) {
                        ((C1521Ls1) tag).u(K);
                    }
                }
            }
        }
    }
}
