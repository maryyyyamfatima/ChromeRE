package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yo0 */
/* loaded from: classes.dex */
public final class C3190Yo0 implements InterfaceC7833mx0, InterfaceC6457ix0 {
    public final Wb4 a;
    public final C8908q5 b;
    public final int c;

    public C3190Yo0(Wb4 wb4, C8908q5 c8908q5) {
        this.a = wb4;
        this.b = c8908q5;
        int i = c8908q5.a;
        if (i == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i = c7931nE2.b(C8908q5.class).j(c8908q5);
            c8908q5.a = i;
        }
        this.c = i;
    }

    @Override // defpackage.InterfaceC7833mx0
    public final void b(View view, View view2) {
        boolean z;
        Wb4 wb4 = this.a;
        if (wb4 != null) {
            InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl", 95, "onViewVisible", "ViewActionsLoggerImpl.java");
            int i = this.c;
            interfaceC5462g31.d(i, "#onViewVisible, contentKey=%s");
            Iterator it = ((Zb4) wb4).d.iterator();
            while (it.hasNext()) {
                Yb4 yb4 = (Yb4) it.next();
                RecyclerView recyclerView = yb4.b.a.j;
                View view3 = view;
                while (true) {
                    if (!Objects.equals(recyclerView, view3)) {
                        Object parent = view3.getParent();
                        if (!(parent instanceof View)) {
                            z = false;
                            break;
                        }
                        view3 = (View) parent;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    yb4.d.a(1, Integer.valueOf(i));
                    view.setTag(R.id.tag_view_actions_content_key, Integer.valueOf(i));
                    CS a = yb4.b.a(view);
                    if (a.a.d) {
                        HashMap hashMap = yb4.e;
                        if (hashMap.containsKey(Integer.valueOf(i))) {
                            continue;
                        } else {
                            Integer valueOf = Integer.valueOf(i);
                            byte b = (byte) 1;
                            C8908q5 c8908q5 = this.b;
                            if (c8908q5 == null) {
                                throw new NullPointerException("Null payload");
                            }
                            if (b != 1) {
                                StringBuilder sb = new StringBuilder();
                                if ((b & 1) == 0) {
                                    sb.append(" durationMs");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
                            }
                            hashMap.put(valueOf, new C2409So(0L, c8908q5, a));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6457ix0
    public final void a(View view) {
        Wb4 wb4 = this.a;
        if (wb4 != null) {
            InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) Zb4.e.b().g("com/google/chrome/elements/actions/view/impl/ViewActionsLoggerImpl", 105, "onViewHidden", "ViewActionsLoggerImpl.java");
            int i = this.c;
            interfaceC5462g31.d(i, "#onViewHidden, contentKey=%s");
            view.setTag(R.id.tag_view_actions_content_key, -1);
            Iterator it = ((Zb4) wb4).d.iterator();
            while (it.hasNext()) {
                ((Yb4) it.next()).d.remove(Integer.valueOf(i));
            }
        }
    }
}
