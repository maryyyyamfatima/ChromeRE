package org.chromium.components.content_creation.reactions;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ReactionMetadataConversionBridge {
    public static List createReactionList() {
        return new ArrayList();
    }

    public static ReactionMetadata createMetadataAndMaybeAddToList(List list, int i, String str, String str2, String str3, int i2) {
        ReactionMetadata reactionMetadata = new ReactionMetadata(i, str, str2, str3, i2);
        if (list != null) {
            list.add(reactionMetadata);
        }
        return reactionMetadata;
    }
}
