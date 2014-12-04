/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.util.typedef;

import org.apache.ignite.cluster.*;
import org.apache.ignite.lang.*;
import org.gridgain.grid.util.lang.*;

/**
 * Defines {@code alias} for <tt>GridPredicate&lt;GridNode&gt;</tt> by extending
 * {@link org.apache.ignite.lang.IgnitePredicate}. Since Java doesn't provide type aliases (like Scala, for example) we resort
 * to these types of measures. This is intended to provide for more concise code without sacrificing
 * readability. For more information see {@link org.apache.ignite.lang.IgnitePredicate} and {@link org.apache.ignite.cluster.ClusterNode}.
 * @see org.apache.ignite.lang.IgnitePredicate
 * @see org.apache.ignite.cluster.ClusterNode
 * @see GridFunc
 */
public interface PN extends IgnitePredicate<ClusterNode> { /* No-op. */ }
