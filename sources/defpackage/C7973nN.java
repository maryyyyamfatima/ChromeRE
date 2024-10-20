package defpackage;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7973nN extends AbstractC10828vh3 {
    public static final String[] i = {"_id", "url", "visits", "date", "bookmark", "title", "favicon", "created"};
    public final Object g = new Object();
    public UriMatcher h;

    @Override // defpackage.AbstractC10828vh3
    public final int a(Uri uri) {
        return 0;
    }

    @Override // defpackage.AbstractC10828vh3
    public final Uri e(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // defpackage.AbstractC10828vh3
    public final int h(Uri uri, ContentValues contentValues) {
        return 0;
    }

    @Override // defpackage.AbstractC10828vh3
    public final String d(Uri uri) {
        synchronized (this.g) {
            if (this.h == null) {
                this.h = new UriMatcher(-1);
                String str = c().getPackageName() + ".ChromeBrowserProvider";
                this.h.addURI(str, "bookmarks", 0);
                this.h.addURI(str, "bookmarks/#", 1);
                String str2 = c().getPackageName() + ".browser";
                this.h.addURI(str2, "bookmarks", 2);
                this.h.addURI(str2, "bookmarks/#", 3);
                this.h.addURI(str2, "searches", 4);
                this.h.addURI(str2, "searches/#", 5);
                this.h.addURI(str2, "history", 6);
                this.h.addURI(str2, "history/#", 7);
                this.h.addURI(str2, "combined", 2);
                this.h.addURI(str2, "combined/#", 3);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "history", 6);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "history/#", 7);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "combined", 2);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "combined/#", 3);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "searches", 4);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "searches/#", 5);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "bookmarks", 8);
                this.h.addURI("com.google.android.apps.chrome.browser-contract", "bookmarks/#", 9);
                this.h.addURI("com.android.browser", "history", 6);
                this.h.addURI("com.android.browser", "history/#", 7);
                this.h.addURI("com.android.browser", "combined", 2);
                this.h.addURI("com.android.browser", "combined/#", 3);
                this.h.addURI("com.android.browser", "searches", 4);
                this.h.addURI("com.android.browser", "searches/#", 5);
                this.h.addURI("com.android.browser", "bookmarks", 8);
                this.h.addURI("com.android.browser", "bookmarks/#", 9);
                this.h.addURI("browser", "bookmarks", 2);
                this.h.addURI("browser", "bookmarks/#", 3);
                this.h.addURI("browser", "searches", 4);
                this.h.addURI("browser", "searches/#", 5);
                this.h.addURI(str2, "bookmarks/search_suggest_query", 10);
                this.h.addURI(str2, "search_suggest_query", 11);
            }
        }
        switch (this.h.match(uri)) {
            case 0:
            case 2:
                return "vnd.android.cursor.dir/bookmark";
            case 1:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "vnd.android.cursor.item/bookmark";
            case 4:
                return "vnd.android.cursor.dir/searches";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "vnd.android.cursor.item/searches";
            case 6:
                return "vnd.android.cursor.dir/browser-history";
            case 7:
                return "vnd.android.cursor.item/browser-history";
            default:
                throw new IllegalArgumentException("ChromeBrowserProvider: getType - unknown URL " + uri);
        }
    }

    @Override // defpackage.AbstractC10828vh3
    public final MatrixCursor f(Uri uri, String[] strArr) {
        return new MatrixCursor(i, 0);
    }
}
