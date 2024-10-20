package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mE1 */
/* loaded from: classes.dex */
public final class C7586mE1 extends RuntimeException {
    public C6206iD0 a;
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final C7849n00 i;
    public final ComponentTree j;

    public C7586mE1(C7849n00 c7849n00, ComponentTree componentTree, Throwable th) {
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
        this.i = c7849n00;
        this.j = componentTree;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        WZ wz;
        Throwable cause = getCause();
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        StringBuilder sb = new StringBuilder("Real Cause => ");
        sb.append(cause.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(cause.getMessage());
        sb.append("\nLitho Context:\n");
        ArrayList arrayList = this.g;
        if (!arrayList.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                sb.append(((WZ) arrayList.get(size)).c0());
                if (size != 0) {
                    sb.append(" -> ");
                }
            }
            sb.append("\n");
        }
        ComponentTree componentTree = this.j;
        C7849n00 c7849n00 = this.i;
        if (c7849n00 != null && c7849n00.d() != null) {
            sb.append("  log_tag: ");
            sb.append(c7849n00.d());
            sb.append("\n");
        } else if (componentTree != null && componentTree.g0 != null) {
            sb.append("  log_tag: ");
            sb.append(componentTree.g0);
            sb.append("\n");
        }
        if (componentTree == null) {
            componentTree = c7849n00 != null ? c7849n00.l : null;
        }
        if (componentTree != null) {
            sb.append("  tree_root: ");
            synchronized (componentTree) {
                wz = componentTree.N;
            }
            sb.append(wz.c0());
            sb.append("\n");
        }
        if (c7849n00 != null && c7849n00.f != null) {
            sb.append("  component_scope: ");
            sb.append(c7849n00.f.c0());
            sb.append("\n");
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append("\n");
        if (c7849n00 != null) {
            C5277fX3 c5277fX3 = c7849n00.k;
            X5.a(c5277fX3 != null ? c5277fX3.a(AbstractC6025hi0.class) : null);
        }
        for (Map.Entry entry : this.h.entrySet()) {
            sb.append("  ");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
