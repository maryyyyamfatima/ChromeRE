package defpackage;

import java.util.Comparator;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gB */
/* loaded from: classes.dex */
public final class C5507gB implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z = ((BookmarkBridge.BookmarkItem) obj).d;
        if (z == ((BookmarkBridge.BookmarkItem) obj2).d) {
            return 0;
        }
        return z ? -1 : 1;
    }
}
