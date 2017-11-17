/*
 * Copyright 2014 Matthias Einwag
 *
 * The jawampa authors license this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package ws.wamp.jawampa;

public enum RegisterFlags {
    /**
     * the registered procedure is called with the caller's sessionID as part of the call details object.
     */
    DiscloseCaller,
    
    /**
     * How are duplicate registrations of this procedure handled?
     */
    InvokeSingle, // default, duplicate registrations cause errors and not necessary to specify but will override if multiple invoke flags are present
    InvokeLast, // the last client to register is called when the precedure is executed
    InvokeFirst, // the first client to register is called when the precedure is executed
    InvokeRoundRobin, // all clients that are registered will be called in a round robin fashion
    InvokeRandom, // all clients that are registered will be called in a random fashion
    
    /**
     * How is this procedure registration matched against procedure call uris
     */
    MatchExact, //default, exact procedure URI match and not necessary to specify but will override if multiple match flags are present
    MatchPrefix, // match for all precedure calls that have the given uri prefix
    MatchWildcard // matching using .. wildcards
    ;
}
