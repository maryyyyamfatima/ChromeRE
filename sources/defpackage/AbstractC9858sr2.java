package defpackage;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import com.google.android.libraries.elements.internal.PerformOnceCommandControllerModule$PerformOnceCommandControllerImpl;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9858sr2 {
    public static final PerformOnceCommandControllerModule$PerformOnceCommandControllerImpl a = new PerformOnceCommandController() { // from class: com.google.android.libraries.elements.internal.PerformOnceCommandControllerModule$PerformOnceCommandControllerImpl
        private static final Set identifierSet = new HashSet();

        @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
        public void insert(String str) {
            Set set = identifierSet;
            synchronized (set) {
                set.add(str);
            }
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
        public boolean contains(String str) {
            boolean contains;
            Set set = identifierSet;
            synchronized (set) {
                contains = set.contains(str);
            }
            return contains;
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
        public void clear() {
            Set set = identifierSet;
            synchronized (set) {
                set.clear();
            }
        }
    };
}
